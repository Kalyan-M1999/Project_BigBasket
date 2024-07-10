package project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchpage {
	 WebDriver driver;

    @FindBy(xpath = "//div[@class='Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD']//input[@placeholder='Search for Products...']")
    private WebElement searchBox;
    
    public Searchpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickonsearch() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchBox)).click();
    }
    public void enterproductname(String product) {
    	searchBox.sendKeys(product);
    }
    
    public void pressEnterKey() {
      searchBox.sendKeys(Keys.ENTER);
}
}
