package com.springerNature.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearchPage {

    @FindBy(css="#advanced-search-form .title-is")
    private WebElement title;

    @FindBy(css="#advanced-search-form .author-is")
    private WebElement author;

    @FindBy(id="submit-advanced-search")
    private WebElement advancedSearch;

    @FindBy(css=".open-search-options")
    private WebElement openAdvancedSearch;

    @FindBy(id="advanced-search-link")
    private WebElement advancedSearchButton;

    public void clickOnAdvancedSearch() {
        openAdvancedSearch.click();
        advancedSearchButton.click();
    }

    public void enterTitle(String titleText) {
        title.sendKeys(titleText);
    }

    public void enterAuthor(String authorText) {
        author.sendKeys(authorText);
    }

    public void clickOnSearchButton() {
        advancedSearch.submit();
    }
}
