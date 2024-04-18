package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement searchBox= driver.findElement(By.xpath("//*[@id='gh-ac']"));
  searchBox.click();
  searchBox.sendKeys("red dress");
  Thread.sleep(4000);
   String currentWindow= driver.getWindowHandle();
   Set<String> windows= driver.getWindowHandles();

   for(String handle : windows){
       String title=driver.switchTo().window(handle).getTitle();
       System.out.println(title);
       if(title.equals("new w"))
           driver.close();
   }

       driver.quit();
    }
}
