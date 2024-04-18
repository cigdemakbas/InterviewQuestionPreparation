package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String title="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedTitle=driver.getTitle();
        Assert.assertEquals("",title,expectedTitle);
        System.out.println(expectedTitle);
        System.out.println(title);


        WebElement besteller= driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Business-Industrial/12576/bn_1853744'])[2]"));
        besteller.click();
        Thread.sleep(3000);
        Actions action= new Actions(driver);
        action.moveToElement(besteller).perform();
        driver.quit();
    }
}
