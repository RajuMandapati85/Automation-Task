package com.springerNature.stepdefinitions;

import com.springerNature.pageobjects.ProductPage;
import com.springerNature.utilities.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.PageFactory;

public class ProductPageSteps {

    ProductPage productPage = PageFactory.initElements(DriverFactory.driver,ProductPage.class);

    @And("^Customer adds (\\d+) product into the cart$")
    public void customerAddsProductIntoTheCart(int numberOfItems) {
        productPage.addProductsIntoCart(numberOfItems);
    }

    @And("^Customer clicks on Proceed to checkout$")
    public void customerClicksOnProceedToCheckout() {
        productPage.clickOnProceedToCheckout();
    }

    @And("^Customer Checkout the Products$")
    public void customerCheckoutTheProducts() {
        productPage.ClickOnCheckOut();
    }

    @Then("^Customer should see the Signin page for Checkout$")
    public void customerShouldSeeTheSigninPageForCheckout() {
      MatcherAssert.assertThat("SignIn Form should be displayed for Checkout",productPage.isSignFormDisplayed());
    }
}
