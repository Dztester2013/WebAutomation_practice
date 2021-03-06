package ys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HomePage {

    WebDriver driver;
    String url = "https://www.amazon.com/";


    @BeforeMethod
    public void ChromeSetup() {
        String chromePath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }


    public void fashionSection() {

        // driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
        driver.findElement(By.linkText("Fashion")).click();
    }

    @AfterMethod
    public void tearDown() {//one of the common name the industry use for closing the driver
        //driver.close() ;

        //driver.quit();
    }

    public void bestSellersSection() {
        driver.findElement(By.linkText("Best Sellers")).click();

    }

    public void customerServiceSection() {
        driver.findElement(By.linkText("CustomerService")).click();
    }

    public void todayDealsSection() {
        driver.findElement(By.linkText("Today's Deals")).click();
    }

    public void booksSection() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
    }

    public void primeSection() {
        driver.findElement(By.linkText("Prime")).click();
    }

    public void newReleasesSection() {
        driver.findElement(By.linkText("New Releases")).click();

    }

    public void kindleBooksSection() {
      //  driver.findElement(By.xpath("l/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[8])).click")).click();
        driver.findElement(By.linkText("Kindle Books")).click();
    }

    public void giftCardsSection(){
        driver.findElement(By.xpath("/html/body")).click();
    }

    public void findAGiftSection(){
        //driver.findElement(By.linkText("Find a Gift")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();

    }

    public void toysAndGamesSection(){
        //driver.findElement(By.id("nav_cs_10")).click();
          driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[11]")).click();
    }

   public void textBookRentalsSection() {
       driver.findElement(By.linkText("Textbook Rentals")).click();


   }

   public void childrensBooksSection(){
        driver.findElement(By.linkText("Children's Books")).click();
   }
    public void historyTSection(){
        driver.findElement(By.linkText("History")).click();
    }

    public void romanceSection(){
        driver.findElement(By.linkText("Romance")).click();
    }



    }