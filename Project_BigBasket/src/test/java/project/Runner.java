package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {
    private WebDriver driver;
     LoginPage loginPage;
     Searchpage search;
     Offer check;
     MouseActions MA;
     AddtoCart add;

    @BeforeMethod
    public void setUp() throws IOException {
        Properties p1 = new Properties();
        FileInputStream FIS = new FileInputStream("C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\Project_BigBasket\\src\\test\\resources\\variable.properties");
        p1.load(FIS);
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(p1.getProperty("URL"));
        
        loginPage = new LoginPage(driver);
        search = new Searchpage(driver);
        check = new Offer(driver);
        MA = new MouseActions(driver);
        add = new AddtoCart(driver);
    }

    @Test(groups="smoke")
    public void testLogin() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(2000);
        loginPage.enterMobileNumber("7978675388");
        Thread.sleep(2000);
        loginPage.clickContinueButton();
    }

    @Test(groups="smoke")
    public void search() throws InterruptedException {
    	search.clickonsearch();
        Thread.sleep(2000);
        search.enterproductname("apple");
        Thread.sleep(2000);
        search.pressEnterKey();
    }

    @Test(groups="smoke")
    public void offercheck() throws InterruptedException {
    	Thread.sleep(2000);
        check.checkoff();
    	Thread.sleep(2000);
        check.allproduct();
    	Thread.sleep(2000);
    	check.details();
        Thread.sleep(2000);
        check.selectrange();
        Thread.sleep(4000);

    }

    
    @Test(groups="smoke")
    public void mouseaction() throws InterruptedException {
    	Thread.sleep(3000);
    	Thread.sleep(2000);
    	MA.mouseclickaction();
    	Thread.sleep(2000);
    	MA.mouseperm();
    }
    @Test(groups="smoke")
    public void addgrocery() throws InterruptedException {
    	Thread.sleep(3000);
    	add.clickADD();
    	Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
