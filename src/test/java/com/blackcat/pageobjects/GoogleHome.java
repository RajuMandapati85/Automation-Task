package com.blackcat.pageobjects;

import com.blackcat.utilities.DriverFactory;
import com.blackcat.utilities.TestContext;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;


public class GoogleHome extends DriverFactory {

    @FindBy(name="q")
    private WebElement searchBar;

    @FindBy(css="table tr td input")
    List<WebElement> currencyValues;

    @FindBy(css=".obcontainer")
    private WebElement table;

    int explicitWaitTime=-1;

    private static final int DEFAULT_POLLING_IN_MILLS = 500;


    public int getExplicitWaitTime() {
        if (explicitWaitTime == -1) {
            String explicitWaitString = System.getProperty("explicitWait");
            if (explicitWaitString == null) {
                explicitWaitString = "120";
            }
            explicitWaitTime = Integer.parseInt(explicitWaitString);
        }
        return explicitWaitTime;
    }

    private FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(getExplicitWaitTime())).pollingEvery(Duration.ofMillis(DEFAULT_POLLING_IN_MILLS)).
        ignoring(StaleElementReferenceException.class, NoSuchElementException.class);


    public void goToGoogleHomePage() {
        driver.navigate().to(TestContext.getInstance().readproperty("base.url"));
        wait.until(ExpectedConditions.titleIs("Google"));
    }

    public void searchForGBPToUSD(String conversion) {
        searchBar.sendKeys(conversion);
        searchBar.submit();
        wait.until(ExpectedConditions.visibilityOf(table));
    }

    public int getValueOfPound() {
        return Integer.parseInt(currencyValues.get(0).getAttribute("value"));
    }

    public Double getValueOfDollar(){
        return Double.valueOf(currencyValues.get(1).getAttribute("value"));
    }

}
