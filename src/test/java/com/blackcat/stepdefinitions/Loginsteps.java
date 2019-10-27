package com.blackcat.stepdefinitions;

import com.blackcat.pageobjects.Login;
import com.blackcat.utilities.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bothees on 11/10/2016.
 */
public class Loginsteps {

    final static Logger logger = LoggerFactory.getLogger(Homepagesteps.class);

    private static String expectedstring = "Boothiraj";

    Login login = PageFactory.initElements(DriverFactory.driver,Login.class);


    @Given("^user am on LoginPage$")
    public void user_am_on_LoginPage() throws Throwable {
        login.goToLoginpage();
    }

    @When("^user enter valid username$")
    public void user_enter_valid_username() throws Throwable {
        login.enteruserName();
    }

    @When("^user enter valid password$")
    public void user_enter_valid_password() throws Throwable {
        login.enteruserPassword();
    }
    @When("^user click on login button$")
    public void user_click_on_login_button() throws Throwable {
        login.clickLoginButton();
    }

    @Then("^user should see the homepage$")
    public void user_should_see_the_homepage() throws Throwable {
        Assert.assertEquals(expectedstring,login.verifyHomepage());
    }

}
