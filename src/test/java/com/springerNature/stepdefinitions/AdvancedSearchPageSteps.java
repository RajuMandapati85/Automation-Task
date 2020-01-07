package com.springerNature.stepdefinitions;

import com.springerNature.pageobjects.AdvancedSearchPage;
import com.springerNature.utilities.DriverFactory;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;

public class AdvancedSearchPageSteps {

    AdvancedSearchPage advancedSearchPage = PageFactory.initElements(DriverFactory.driver,AdvancedSearchPage.class);

    @Given("^User Clicks on Advanced search button$")
    public void user_Clicks_on_Advanced_search_button() {
        advancedSearchPage.clickOnAdvancedSearch();
    }

    @Given("^User enters title as \"([^\"]*)\" on title contains field$")
    public void user_enters_title_as_on_title_contains_field(String title) {
        advancedSearchPage.enterTitle(title);
    }

    @Given("^User enters author as \"([^\"]*)\" on author / editor field$")
    public void user_enters_author_as_on_author_editor_field(String author) {
        advancedSearchPage.enterAuthor(author);
    }

    @Given("^User clicks on Search button on Advanced search form$")
    public void user_clicks_on_Search_button_on_Advanced_search_form() {
        advancedSearchPage.clickOnSearchButton();
    }
}
