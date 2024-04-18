package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        String URL="https://the-internet.herokuapp.com/";
        driver.get(URL);
Thread.sleep(3000);
        WebElement element= driver.findElement(By.xpath("//a[@href='/typos']"));
       Actions action= new Actions(driver);
      //  action.moveToElement(element).perform();
       action.click(element).perform();
      // action.moveToElement(element).perform();

        Actions actions= new Actions(driver);



        Thread.sleep(4000);
        driver.quit();
    }
}
