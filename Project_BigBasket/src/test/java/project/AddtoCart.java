package project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart {
    WebDriver driver;

    @FindBy(xpath = "//body/div[@id='__next']/div[@id='siteLayout']/div[@class='col-span-12 flex flex-col']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[5]/div[1]/div[2]/button[1]")
    private WebElement addToCartButton;

    public AddtoCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void clickADD() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
