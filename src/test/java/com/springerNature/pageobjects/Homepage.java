package com.springerNature.pageobjects;

import com.springerNature.utilities.DriverFactory;
import com.springerNature.utilities.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by bothees on 27/11/2018.
 */
public class Homepage extends DriverFactory {

    TestContext testContext  = TestContext.getInstance();

    @FindBy(id = "query")
    private WebElement searchBar;

    @FindBy(id="search")
    private WebElement search;

    public void goToHomepage(){
        DriverFactory.driver.get("https://link.springer.com");
    }

    public void enterSearchText(String searchText){
        searchBar.clear();
        searchBar.sendKeys(searchText);
        search.submit();
    }
}
