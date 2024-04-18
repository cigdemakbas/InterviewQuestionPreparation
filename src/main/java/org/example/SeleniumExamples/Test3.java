package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://the-internet.herokuapp.com/";
        driver.get(url);


        WebElement newW= driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a"));
        newW.click();
        WebElement cl=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        cl.click();
        Thread.sleep(3000);
        Set<String> windwsID= driver.getWindowHandles();
        Iterator <String> it= windwsID.iterator();
        String parentWindwID=it.next();

        String childWindowID=it.next();

        driver.switchTo().window(parentWindwID);
        Thread.sleep(3000);
        driver.switchTo().window(childWindowID);
        Thread.sleep(4000);
        driver.quit();
    }
}
