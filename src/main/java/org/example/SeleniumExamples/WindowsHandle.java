package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowsHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        String url="https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement newW= driver.findElement(By.xpath("//a[@href='/windows']"));
        newW.click();
        WebElement cl=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        cl.click();
        Thread.sleep(3000);

        String currentWindow= driver.getWindowHandle();
        Set<String> windows=driver.getWindowHandles();
     //  List<String> windowsIDList= new ArrayList<>(windows);

//        for(String handle : windows) {
//              if (handle.equals(currentWindow)) {
//            String title = driver.switchTo().window(handle).getTitle();
//            System.out.println(title);
//            Thread.sleep(2000);
//              }
//        }

        for ( String windowID : windows){
            String title=driver.switchTo().window(windowID).getTitle();
            Thread.sleep(2000);
            System.out.println(title);
            if(title.equals("New Window")){
                driver.close();
            }}

        Thread.sleep(3000);

        driver.quit();
    }
}
