package com.elsiver.pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

  Common common = new Common();

  @FindBy(css = ".ajax_add_to_cart_button")
  private List<WebElement> addToCart;

  @FindBy(css = ".continue")
  private WebElement continueShopping;

  @FindBy(css = "a.button-medium")
  private WebElement proccedToCheckout;

  @FindBy(css = ".standard-checkout")
  private WebElement checkOut;

  @FindBy(css = ".product-image-container")
  private List<WebElement> products;

  @FindBy(css = "a[title='Proceed to checkout']")
  private WebElement proceedToCheckout;

  @FindBy(id = "email")
  private WebElement signInEmail;

  private By cart = new By.ByCssSelector(".ajax_add_to_cart_button");

  public void addProductsIntoCart(int numberOfItems) {
    common.waitForPresenceOfElements(cart);
    for (int i = 0; i < numberOfItems; i++) {
      common.scrollIntoView(products.get(i));
      common.moveToElementAndClickUsingJs(addToCart.get(i));
      common.moveToElementAndClickUsingJs(continueShopping);
    }
  }

  public void clickOnProceedToCheckout() {
    common.moveToElementAndClickUsingJs(common.waitForVisibilityOfElement(proceedToCheckout));
  }

  public void ClickOnCheckOut() {
    common.moveToElementAndClickUsingJs(common.waitForVisibilityOfElement(checkOut));
  }

  public Boolean isSignFormDisplayed() {
    return common.waitForVisibilityOfElement(signInEmail).isDisplayed();
  }
}
