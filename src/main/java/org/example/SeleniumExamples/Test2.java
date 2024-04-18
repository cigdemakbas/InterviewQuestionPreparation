package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        String url= "https://www.ebay.com/";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement logo= driver.findElement(By.id("gh-logo"));
       // if(logo.isDisplayed()){
       //     System.out.println("Logo id displayed");
      //  }else {
       //     System.out.println("Logo is NOT displayed");
      //  }

        boolean logoDisplay= logo.isDisplayed();
        System.out.println("Logo displays : "+logoDisplay);
        WebElement searchBox= driver.findElement(By.xpath("//*[@id='gh-ac']"));
      //  searchBox.sendKeys("red dress");
    //    WebElement searechButton=driver.findElement(By.id("gh-btn"));
        //searechButton.click();
       /* String expectedURL= "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p4432023.m570.l1313&_nkw=red+dress&_sacat=0";
        String actualURL=driver.getCurrentUrl();
        System.out.println("actualURL : "+ actualURL);
        System.out.println("expectedURL : "+expectedURL);*/
      //  Assert.assertEquals("URL not matched",expectedURL,actualURL);
     /*  if(expectedURL.equals(actualURL)){
            System.out.println("URL matches");
        } else System.out.println("URL NOT matches");
*/

        String expectedTitle="red dress for sale | eBay";
        String actualTitle=driver.getTitle();
     //   System.out.println("exp title : "+ expectedTitle+ "act title : "+actualTitle);
     //   Assert.assertEquals("NOT matched",actualTitle,expectedTitle);
        WebElement myEbay=driver.findElement(By.xpath("//a[@title='My eBay']"));
       WebElement drpdwn= driver.findElement(By.id("gh-cat"));
       Select list=new Select(drpdwn);
     //  list.deselectByVisibleText("Books");
      //  list.selectByVisibleText("Books");
      //  list.selectByValue("20081");
      //  list.selectByIndex(2);


       Thread.sleep(3000);

        driver.close();
    }
}
