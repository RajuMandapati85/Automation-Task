package com.springerNature.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsPage {

    Common common = new Common();

    @FindBy(id="number-of-search-results-and-search-terms")
    private WebElement numberOfResults;

    @FindBy(css = "#results-list a")
    private List<WebElement> resultsLink;

    @FindBy(css = ".page-title")
    private WebElement title;

    public int getNumberOfResults() {
        String number = common.waitForVisibilityOfElement(numberOfResults).getAttribute("innerText").replaceAll(",","");
        return Integer.valueOf(number.split("\\s+")[0]);
    }

    public void clickOnFirstResult() {
        common.waitForVisibilityOfElement(resultsLink.get(0)).click();
    }

    public String getTitleOfTheBook() {
        return common.waitForVisibilityOfElement(title).getAttribute("innerText");
    }
}
