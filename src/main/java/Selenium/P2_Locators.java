package Selenium;

import Utils.BrowserFactory;
import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P2_Locators {

   private WebDriver driver;

    @BeforeMethod
       public void setup(){
             driver= BrowserFactory.getDriver("chrome");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
             driver.get("http://amazon.com");

         }

         @Test
         public void test()  {
        //Locators
        // 1-id(if it is not contain numbers it should be first preferences)
//             BrowserUtils.wait(3);
//             driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Advil", Keys.ENTER);
//             BrowserUtils.wait(3);
            // driver.findElement(By.className("nav-input")).click();

          // 2-name(second preferences)
//             BrowserUtils.wait(3);
//             driver.findElement(By.name("field-keywords")).sendKeys("Advil", Keys.ENTER);
//             BrowserUtils.wait(3);

         // 3-ClassName
//             BrowserUtils.wait(3);
//             driver.findElement(By.className("nav-search-dropdown")).click();
//             BrowserUtils.wait(3);
//             driver.findElement(By.className("hm-icon")).click();
//             BrowserUtils.wait(3);

             // 4-Linktext
//             BrowserUtils.wait(3);
//             driver.findElement(By.linkText("Best Sellers")).click();
//             BrowserUtils.wait(3);

             // 5-PartialLinktext
//             BrowserUtils.wait(3);
//             driver.findElement(By.partialLinkText("Best")).click();
//             BrowserUtils.wait(3);


             // 6-tagname
//             BrowserUtils.wait(3);
//             WebElement el=driver.findElement(By.tagName("h1"));
//             System.out.println(el.getText());
//             BrowserUtils.wait(3);


             // 7-Css
//             BrowserUtils.wait(3);
//             driver.findElement(By.cssSelector("[class='nav_a nav-swm-text']")).click();
//             BrowserUtils.wait(3);

             // 8-xpath
             //Absolute xpath==>it starts single slash from root to bottom
//             BrowserUtils.wait(3);
//             driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/span[1]/a[1]/div[2]/span[1]")).click();
//             BrowserUtils.wait(3);

             //relative xpath==>it starts double slash
//             BrowserUtils.wait(3);
//             driver.findElement(By.xpath("//span[@id='glow-ingress-line1']")).click();
//             BrowserUtils.wait(3);

             //contains,starts-with,ends-with,and,or,text,parent,child,sibling.....

             //contains

             //original state==>//input[contains(@id,'twotabsearchtextbox')]
//             driver.findElement(By.xpath("//input[contains(@id,'tw')]")).click();

             //starts-with
             // original state==>//input[contains(@id,'twotabsearchtextbox')]
             //  driver.findElement(By.xpath("//input[starts-with(@id,'t')]")).click();

             //And-or
             // original state==>//input[contains(@id,'twotabsearchtextbox')]
             //  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @type='text']")).click();
             //  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @type='aaaa']")).click();

             //text
             //  driver.findElement(By.xpath("//a[text()='New Releases']")).click();

             //css =>contains,starts-with,ends-with
             //original css locator [id='twotabsearchtextbox']

             //* means contains
             // driver.findElement(By.cssSelector("[id*='tw']")).click();
             //^ means starts-with
             //driver.findElement(By.cssSelector("[id^='t']")).click();
             //$ means ends-with
             //driver.findElement(By.cssSelector("[id$='box']")).click();

             //Traverse between parent and child
             //1-parent to child
             //parent==><div id="nav-global-location-slot" xpath="1">
             //2-child  to parent
             //div[@id='nav-main']//div[contains(@class,'nav-left')]/parent::div
              //or
             //div[@id='nav-main']//div[contains(@class,'nav-left')]/..

             //traverse between siblings

             //*[@id="nav-search"]/form/div[2]/preceding-sibling::div
             //*[@id="nav-search"]/form/div[2]/following-sibling::div



             //nth-child and nth-of-type
             //generally if nth-child is work nth-of-type work too in the same place,but the opposite is not always valid
             //css just go forward,but xpath go forward and back
/*
    <div id="nav-main" class="nav-sprite" xpath="1">==>parent
      <div class="nav-left">==>child(1)
      <div class="nav-right">==>child(2)
     */
          //both nth-child and nth-of-type work in here too
          //#nav-main>div:nth-child(1)==>goes parent to first child
          //#nav-main>div:nth-child(2)==>goes parent to second child
          //#nav-main>div:nth-of-type(1)==>goes parent to first child
          //#nav-main>div:nth-of-type(2)==>goes parent to second child


         }


         @AfterMethod
    public void teardown(){
        driver.close();
         }
}
