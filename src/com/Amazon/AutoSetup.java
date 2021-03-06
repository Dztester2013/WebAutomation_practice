package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoSetup {
    WebDriver driver;
    String url = "https://www.amazon.com/";
    //String email="dztester2013@gmail.com";

    //  String password="Tester121";

    @BeforeMethod
    public void chromeSetUp() {

        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

//        String firefoxpath="BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",firefoxpath);
//        driver =new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get(url);
    }

    //   @Test (priority = 1)
    public void login() throws InterruptedException {
        Config config = new Config();
        String email = config.getEmail();
        String password = config.getPassword();
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ap_email")).sendKeys(email);
        Thread.sleep(2000);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ap_password")).sendKeys(password);
        Thread.sleep(2000);

        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);

    }

    public void mostReviewAutomationBook() throws InterruptedException {
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium automation");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.id("s-result-sort-select_5")).click();
    }

    public void slideShowOfitem() throws InterruptedException {
        driver.findElement(By.linkText("Books")).click();

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("a-autoid-0")).click();
            Thread.sleep(1000);

        }
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("a-autoid-1")).click();
            Thread.sleep(1000);

        }
    }

    public void advancedSearchBook() throws InterruptedException {
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Advanced Search")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[1]/div[1]/input")).sendKeys(" Java");
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[1]/div[2]/input")).sendKeys(" Patrick Niemeyer");
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[1]/div[3]/input")).sendKeys("An Introduction to Real-World Programming");
        driver.findElement(By.id("field-isbn")).sendKeys("978-1492056270");
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[1]/div[5]/input")).sendKeys("O'Reilly ");
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[1]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[1]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[2]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[2]/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[3]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[3]/select/option[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[4]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[4]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[6]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[6]/select/option[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[2]/td/input")).click();


    }

    public void slideShowInFrontPage() throws InterruptedException {
        //  driver.findElement(By.linkText("Books")).click();

        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//*[@id=\"gw-desktop-herotator\"]/div/div/div/div[3]/a/i")).click();
            Thread.sleep(1000);

        }
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//*[@id=\"gw-desktop-herotator\"]/div/div/div/div[1]/a/i")).click();
            Thread.sleep(1000);

        }
    }

    public void scroolDownMenu() throws InterruptedException {
          driver.findElement(By.linkText("Books")).click();
          driver.findElement(By.linkText("Advanced Search")).click();
           driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).click();
            Thread.sleep(1000);
          driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();

         JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
               js.executeScript("window.scrollBy(0,5000)");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[7]")).click();
            driver.findElement(By.linkText("United States")).click();
          driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/div/div[1]/div[2]/div/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[1]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[2]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[2]/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[3]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[3]/select/option[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[4]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[4]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[6]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[1]/td[2]/div[6]/select/option[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"asMain\"]/tbody/tr[2]/td/input")).click();


    }

    public void addElementtocart() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[20]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        driver.findElement(By.id("add-to-cart-button")).click();

    }

public void gifCardpage(){
        driver.findElement(By.linkText("Gift Cards")).click();
}
    public void TodayDeals(){
        driver.findElement(By.linkText("Today's Deals")).click();
    }

    public void findIteminFilterbyDepartment(){
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[9]")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fifa 2021");
    driver.findElement(By.id("nav-search-submit-button")).click();

    }
public void logoClickable(){
    driver.findElement(By.id("nav-logo-sprites")).click();}
public void customerServiceSection(){
    driver.findElement(By.linkText("Customer Service")).click();

}
    public void customerServiceCotent() throws InterruptedException {
        driver.findElement(By.linkText("Customer Service")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/a/div/div")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[2]/div[1]/a/div/div")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[3]/div[1]/a/div")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[1]/div[2]/a/div/div")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[2]/div[2]/a/div/div")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[3]/div[2]/a/div/div")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[1]/div[3]/a/div/div")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[2]/div[3]/a/div/div")).click();
        Thread.sleep(1000);
        driver.navigate().back();
    }

    public void toysSection() throws InterruptedException {
        Thread.sleep(10000);

        driver.findElement(By.linkText("Toys & Games")).click();


    }
    public void fashionSection()  {

        driver.findElement(By.partialLinkText("Fashi")).click();


    }
    public void fashionSectionchoiceBackpack()  {

        driver.findElement(By.partialLinkText("Fashi")).click();
        driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[5]")).click();
driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]/span[1]/a[1]/span[1]")).click();

    }
    public void fashionSectionBackpackunder25dollars()  {

        driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/a[1]/span[1]")).click();

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
            Thread.sleep(5000);

        //driver.close();
          driver.quit();
    }
}
