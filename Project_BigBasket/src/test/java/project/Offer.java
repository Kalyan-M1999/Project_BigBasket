package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Offer {
    WebDriver driver;

    @FindBy(xpath = "//header[@class='sm:hidden z-30 flex flex-col col-span-12']//a[2]//img[1]")
    private WebElement offercheck;
    @FindBy(xpath = "//body/div[@class='body-wrap']/div[@id='dynamicDirective']/carousel-product-widget[1]/section[1]/div[1]/div[1]/div[1]/a[1]/span[1]")
    private WebElement all;
    @FindBy(xpath = "//span[@class='Label-sc-15v1nk5-0 ListSorter___StyledLabel-sc-1btacag-1 gJxZPQ hneWsn']")
    private WebElement rangedetails;
    @FindBy(xpath = "//span[normalize-space()='Price - High to Low']")
    private WebElement selectrange;

    public Offer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkoff() {
        offercheck.click();
    }

    public void allproduct() {
        all.click();
    }

    public void details() {
        rangedetails.click();
    }
    public void selectrange() {
    	selectrange.click();

    	}
}
