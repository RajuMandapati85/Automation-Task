package com.elsiver.pageobjects;

import com.elsiver.utilities.DriverFactory;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common extends DriverFactory {

  public WebDriverWait getWait() {
    WebDriverWait wait = new WebDriverWait(driver, 20);
    return wait;
  }

  public WebElement waitForVisibilityOfElement(WebElement element) {
    return getWait().until(ExpectedConditions.visibilityOf(element));
  }

  public List<WebElement> waitForVisibilityOfElements(List<WebElement> elements) {
    return getWait().until(ExpectedConditions.visibilityOfAllElements(elements));
  }

  public List<WebElement> waitForPresenceOfElements(By by) {
    return getWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));

  }

  public void scrollIntoView(WebElement element) {
    if (driver instanceof JavascriptExecutor) {
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
  }

  public void clickUsingJS(WebElement element) {
    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
  }

  public void moveToElementAndClickUsingJs(WebElement element) {
    scrollIntoView(element);
    clickUsingJS(element);
  }
}
