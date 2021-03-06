package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTesting extends AutoSetup {

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        login();
        String expectResult = "Hello, amar";
        String actualResult = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
        Assert.assertEquals(actualResult, expectResult, "Result didn't match");
    }

    @Test(priority = 2)
    public void mostReviewAutomationBookTest() throws InterruptedException {
        mostReviewAutomationBook();
        String expectResult = "Absolute Beginner (Part 1) Java 4 Selenium WebDriver: Come Learn How To Program For Automation Testing (Black & White Edition) (Practical How To Selenium Tutorials)";
        String actualResult = driver.findElement(By.linkText("Absolute Beginner (Part 1) Java 4 Selenium WebDriver: Come Learn How To Program For Automation Testing (Black & White Edition) (Practical How To Selenium Tutorials)")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectResult, "Result didn't match");

    }

    @Test(priority = 3)
    public void slideShowOfitemtest() throws InterruptedException {
        slideShowOfitem();
        String expectResult = "";
        String actualResult = driver.findElement(By.linkText("")).getText();
        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectResult, "Result didn't match");


    }

    @Test(priority = 4)
    public void advancedSearchBookTest() throws InterruptedException {
        advancedSearchBook();
        String expectResult = "";
        String actualResult = driver.findElement(By.linkText("")).getText();
        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectResult, "Result didn't match");


    }
@Test(priority = 15)
public void testSound() throws InterruptedException {

    driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='pageContent']/div[@id='desktop-banner']/div[@id='gw-desktop-herotator']/div[1]/div[1]/div[1]/div[2]/div[1]/ol[1]/li[3]/div[1]/div[1]/div[1]/div[2]")).click();

}
        @Test(priority = 5)
    public void slideShowInFrontPageTest() throws InterruptedException {
        slideShowInFrontPage();
        String expectResult = "";
        String actualResult = driver.findElement(By.linkText("")).getText();
        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectResult, "Result didn't match");


    }

    @Test(priority = 6)
    public void scroolDownMenuTest() throws InterruptedException {
        scroolDownMenu();
        String expectResult = "";
        String actualResult = driver.findElement(By.linkText("")).getText();
        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectResult, "Result didn't match");
    }
@Test(priority = 7)
public void addElementtocartTest() throws InterruptedException {
    addElementtocart();
    String expectResult = "test";
    String actualResult = driver.findElement(By.linkText("")).getText();
    System.out.println(actualResult);

    Assert.assertEquals(actualResult, expectResult, "Result didn't match");
}
    @Test(priority = 8)
public void giftcardpagetest() throws InterruptedException {
        gifCardpage();
    String expectResult = "Gift Cards";
    String actualResult = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[1]/div/div[1]/div/h1")).getText();
    System.out.println(actualResult);

    Assert.assertEquals(actualResult, expectResult, "Result didn't match");
}
    @Test(priority = 9)
    public void TodayDealstest() throws InterruptedException {
        TodayDeals();
        String expectResult = "Today's Deals";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"gbox-item-0.0.0\"]/div/div/div[1]/h1/div[1]")).getText();
        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectResult, "Result didn't match");
    }
    @Test(priority = 10)
    public void findIteminFilterbyDepartmenttest() throws InterruptedException {
        findIteminFilterbyDepartment();
        String expectResult = "\"Fifa 2021\"";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectResult, "Result didn't match");

    }
    @Test(priority = 10)
    public void logoClickabletest() throws InterruptedException {
        logoClickable();
        String expectResult = "Hello";
        String actualResult = driver.findElement(By.id("glow-ingress-line1")).getText();
        Assert.assertEquals(actualResult, expectResult, "Result didn't match");
    }
        @Test(priority = 11)
        public void customerServiceSectiontest() throws InterruptedException {
            customerServiceSection();
            String expectResult = "Amazon.com Help: Help & Customer Service";
          String actualResult = driver.getTitle();
           Assert.assertEquals(actualResult, expectResult, "Result didn't match");
        }
    @Test(priority = 12)
    public void customerServiceCotenttest() throws InterruptedException {
        customerServiceCotent();
        String expectResult = "Amazon.com Help: Help & Customer Service";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "Result didn't match");
    }
    @Test(priority = 13)
    public void toysSectiontest() throws InterruptedException {
        toysSection();
        String expectResult = "Amazon.com: Toys & Games";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "Result didn't match");
    }



    @Test(priority = 16)
    public void fashionSectiontest() throws InterruptedException {
        fashionSection();
        String expectResult = "Amazon Fashion | Clothing, Shoes & Jewelry | Amazon.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectResult, "Result didn't match");
    }
    @Test(priority = 16)
    public void fashionSectionchoiceBackpacktest() throws InterruptedException {
        fashionSectionchoiceBackpack();
        String expectResult = "BACKPACKS";
        String actualResult = driver.findElement(By.xpath("//span[contains(text(),'BACKPACKS')]")).getText();
        Assert.assertEquals(actualResult, expectResult, "Result didn't match");
    }
@Test(priority = 17)
public void fashionSectionchoiceBackpackunder25dollarstest() throws InterruptedException {
    fashionSectionchoiceBackpack();
    fashionSectionBackpackunder25dollars();
    String expectResult = "BACKPACKS";
    String actualResult = driver.findElement(By.xpath("//span[contains(text(),'BACKPACKS')]")).getText();
    Assert.assertEquals(actualResult, expectResult, "Result didn't match");
}
}
