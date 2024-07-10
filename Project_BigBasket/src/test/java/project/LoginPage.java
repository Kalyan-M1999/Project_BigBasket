package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;

    @FindBy(xpath = "//button[normalize-space()='Login/ Sign Up']")
    private WebElement loginButton;

    @FindBy(id = "multiform")
    private WebElement mobileInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement continueButton; 

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() { 
        loginButton.click();
    }

    public void enterMobileNumber(String mobileNumber) {
        mobileInput.sendKeys(mobileNumber);
    }

    public void clickContinueButton() { 
        continueButton.click();
    }
}
