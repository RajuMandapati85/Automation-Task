package com.blackcat.stepdefinitions;

import com.blackcat.pageobjects.GoogleHome;
import com.blackcat.utilities.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.core.Is.is;

public class GoogleHomeSteps {

    GoogleHome googleHome = PageFactory.initElements(DriverFactory.driver,GoogleHome.class);

    @Given("^I go to url$")
    public void i_go_to_url() throws Throwable {
        googleHome.goToGoogleHomePage();
    }

    @Given("^I type \"([^\"]*)\" on search bar$")
    public void i_type_on_search_bar(String conversion) throws Throwable {
        googleHome.searchForGBPToUSD(conversion);
    }

    @Then("^I should see GBP value is (\\d+)$")
    public void i_should_see_GBP_value_is(int expectedGBPvalue) {
        MatcherAssert.assertThat("GBP value should be 1",googleHome.getValueOfPound(),is(expectedGBPvalue));;
    }

    @Then("^I should see USD value is greater than (\\d+)$")
    public void i_should_see_USD_value_is_greater_than(Double expectedUSDvalue) {
        MatcherAssert.assertThat("GBP value should be 1",googleHome.getValueOfDollor() > expectedUSDvalue);;
    }


}
