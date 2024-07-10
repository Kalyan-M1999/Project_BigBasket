package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {
    WebDriver driver;
    
    @FindBy(xpath = "//button[@id='headlessui-menu-button-:R5bab6:']") 
    WebElement options;
    
    @FindBy(xpath = "//a[@role='none'][normalize-space()='Bakery, Cakes & Dairy']")
    WebElement mouse;
    
    public MouseActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void mouseclickaction() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
    }
    
    public void mouseperm() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouse).build().perform();
    }
}
