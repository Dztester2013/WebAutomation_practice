package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openwebbrowser {
    public static void main(String[] args) throws InterruptedException {
       //chrome Browser
       String chromeDriverpath="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverpath);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        // firefox
        String firefoxDriverpath="BrowserDriver/windows/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",firefoxDriverpath);
        WebDriver   driver2=new FirefoxDriver();
        driver2.get("https://www.amazon.com");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
        driver.close();

        // Edge
//        String edgeDriverPath = "BrowserDriver/windows/msedgedriver.exe";
//        System.setProperty("webdriver.edge.driver", edgeDriverPath);
//        WebDriver driver2 = new EdgeDriver();
//        driver2.get("https://www.amazon.com/");

      //  Thread.sleep(5000); // Wait purpose
    }

}
