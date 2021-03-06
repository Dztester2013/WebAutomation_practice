package ys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestApp extends HomePage {

//    @Test(priority = 9)
//    public void fashionSectionTest() {
//        fashionSection();
//        String expectedText = "Amazon Fashion | Clothing, Shoes & Jewelry | Amazon.com";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }
//
//    @Test(priority = 8)
//    public void bestSellersSectionTest() {
//        bestSellersSection();
//        String expectedText = "Amazon.com Best Sellers: The most popular items on Amazon";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }
//
//    @Test(priority = 7)
//    public void todayDealsSectionTest() {
//        todayDealsSection();
//        String expectedText = "Gold Box Deals | Today's Deals - Amazon.com";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }
//
//    @Test(priority = 6)
//    public void booksSectionTest() {
//        booksSection();
//        String expectedText = "Amazon.com: Books";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }
//
//    @Test(priority = 5)
//    public void primeSectionTest() {
//        primeSection();
//        String expectedText = "Amazon.com: Amazon Prime";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }
//
//    @Test(priority = 4)
//    public void newReleasesSectionTest() {
//        newReleasesSection();
//        String expectedText = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }
//
//    @Test(priority = 3)
//    public void kindleBooksSectionTest() {
//        kindleBooksSection();
//        String expectedText = "Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }

//    @Test(priority = 2)
//    public void giftCardsSectionTest() {
//        giftCardsSection();
//        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }
//
//    @Test(priority = 10)
//    public void findAGiftSectionTest() {
//        findAGiftSection();
//        String expectedText = "Gifts for Everyone | Amazon.com Gift Finder";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Product does not match");
//    }
//
//    @Test(priority = 11)
//    public void toysAndGamesSectionTest() {
//        toysAndGamesSection();
//        String expectedText = "Amazon.com: Toys & Games";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText,"Product does not match");
//    }
//
//     @Test(priority = 12)
//    public void textBookRentalsSectionTest() {
//        textBookRentalsSection();
//        String expectedText = "Amazon";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Product does not match");
//    }
//
//     @Test(priority = 1)
//    public void childrensBooksSectionTest() {
//        childrensBooksSection();
//        String expectedText="Amazon";
//        String actualText= driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Product does not match");
//    }
 //   @Test(priority = 14)
//    public void historyTSectionest(){
//        historySection();
//        String expectedText="Amazon";
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Product match");
//    }

    @Test(priority = 15)
  public void romanceSectionTest(){
        romanceSection();
       String expectedText="Amazon";
        String actualText=driver.getTitle();
       Assert.assertEquals(actualText,expectedText,"Product match");
    }




    }