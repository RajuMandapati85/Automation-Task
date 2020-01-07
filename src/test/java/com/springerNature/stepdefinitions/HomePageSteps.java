package com.springerNature.stepdefinitions;

import com.springerNature.pageobjects.Homepage;
import com.springerNature.utilities.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class HomePageSteps {

    Homepage home = PageFactory.initElements(DriverFactory.driver,Homepage.class);

    @Given("^an user on Springer Nature home page$")
    public void user_on_HomePage() {
        home.goToHomepage();
    }

    @When("^user enter text \"([^\"]*)\" on search bar$")
    public void user_enter_searchText(String searchText) {
        home.enterSearchText(searchText);
    }

}
