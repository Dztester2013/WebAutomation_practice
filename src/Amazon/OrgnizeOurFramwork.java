package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrgnizeOurFramwork {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.amazon.com";
    String product="Iphone";
    String searchBoxLocator="twotabsearchtextbox";
        String searchBottonLocator="nav-search-submit-button";

        //chrome Browser
    String chromeDriverpath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverpath);
    WebDriver driver = new ChromeDriver();
    driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.id(searchBoxLocator)).sendKeys(product);
        driver.findElement(By.id(searchBottonLocator)).click();
        //driver.findElement(By.xpath("//*[@id=\"p_89/Apple\"]/span/a/div")).click();

    Thread.sleep(5000);
    driver.close();
}
}