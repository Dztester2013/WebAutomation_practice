package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePagenew {

    WebDriver driver;
    String url="https://www.amazon.com";
    String product="Iphone";
    String searchBoxLocator="twotabsearchtextbox";
    String searchBottonLocator="nav-search-submit-button";

    @BeforeMethod
    public void setUp(){

        String chromeDriverpath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverpath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);



    }

@AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
