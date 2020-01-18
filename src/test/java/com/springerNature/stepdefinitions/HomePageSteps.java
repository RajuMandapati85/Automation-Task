package com.springerNature.stepdefinitions;

import com.springerNature.pageobjects.Homepage;
import com.springerNature.utilities.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class HomePageSteps {

    Homepage home = PageFactory.initElements(DriverFactory.driver,Homepage.class);

    @Given("^Customer on automation practise home page$")
    public void user_on_HomePage() {
        home.goToHomepage();
    }

    @When("^Customer selects main category \"([^\"]*)\"$")
    public void customerSelectsMainCategory(String mainCategory) {
        home.clickOnMaincategory(mainCategory);
    }

    @And("^Customer selects category \"([^\"]*)\"$")
    public void customerSelectsCategory(String summerDress) {
        home.clickOnSummerDresses(summerDress);
    }
}
