package Amazon;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends HomePagenew {


    @Test
    public void checkSearchBox()  {

        driver.findElement(By.id(searchBoxLocator)).sendKeys(product);
    driver.findElement(By.id(searchBottonLocator)).click();

    }
}
