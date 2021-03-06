package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateElement {
    public static void main(String[] args) throws InterruptedException {
        //chrome Browser
        String chromeDriverpath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverpath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"p_89/Apple\"]/span/a/div")).click();

      //  Thread.sleep(5000);
        //driver.close();
    }
}
