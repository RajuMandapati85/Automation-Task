package com.springerNature.stepdefinitions;


import com.springerNature.pageobjects.ResultsPage;
import com.springerNature.utilities.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.commons.lang3.StringUtils;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class ResultsPageSteps {

    ResultsPage resultsPage = PageFactory.initElements(DriverFactory.driver,ResultsPage.class);

    @Then("^User should see relevant results for \"([^\"]*)\"$")
    public void user_should_see_relevant_results_for(String searchText) {
        MatcherAssert.assertThat("Result should contain title as" + searchText,StringUtils.containsIgnoreCase(resultsPage.getTitleOfTheBook(),searchText));
    }

    @And("^User should see at least (\\d+) result$")
    public void userShouldSeeAtLeastResult(int results) {
        MatcherAssert.assertThat("User should see at least 1 result",resultsPage.getNumberOfResults(),greaterThanOrEqualTo(results));
    }

    @And("^User clicks on first result$")
    public void userClicksOnFirstResult() {
        resultsPage.clickOnFirstResult();
    }
}
