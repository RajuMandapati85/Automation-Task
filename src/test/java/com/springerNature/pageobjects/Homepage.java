package com.springerNature.pageobjects;

import com.springerNature.utilities.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Homepage extends DriverFactory {

    Common common = new Common();

    @FindBy(css = "#block_top_menu li a")
    private List<WebElement> categories;

    @FindBy(css="#left_column .block_content ul li a")
    private List<WebElement> subCategory;

    public void goToHomepage(){
        DriverFactory.driver.get("http://automationpractice.com/index.php");
    }

    public void clickOnMaincategory(String searchText){
        WebElement element = getElementFromListOfElements(categories, searchText,"title");
        common.moveToElementAndClickUsingJs(element);
    }

    public void clickOnSummerDresses(String summerDress) {
        common.waitForVisibilityOfElements(subCategory);
        WebElement element = getElementFromListOfElements(subCategory, summerDress,"innerText");
        element.click();
    }

    private WebElement getElementFromListOfElements(List<WebElement> elements, String category,String attribute) {
        return elements.stream().filter(element -> element.getAttribute(attribute).equalsIgnoreCase(category)).findAny().orElseThrow(()-> new RuntimeException("Category" + category + " is not found"));
    }
}
