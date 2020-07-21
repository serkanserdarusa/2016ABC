package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P19_ScrollDownAndScrollUp {

    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


   @Test(description = "scroll down and up")
   public void ScrollDownAndUp() {
       driver.get("http://amazon.com");

       JavascriptExecutor js = (JavascriptExecutor) driver;
       for (int i = 0; i < 10; i++) {
           //scroll down
           js.executeScript("window.scrollBy(0,500)");//500 pixel will go down
           BrowserUtils.wait(3);
       }
       JavascriptExecutor js1 = (JavascriptExecutor) driver;
       for (int i = 0; i < 10; i++) {
           //scroll up
           js1.executeScript("window.scrollBy(0,-500)");//500 pixel will go up
           BrowserUtils.wait(3);
       }

   }
       @Test(description = "scroll down and up")
       public void ScrollDownAndUp2(){
           driver.get("http://www.delta.com/");
           JavascriptExecutor js1 = (JavascriptExecutor) driver;
           WebElement link=driver.findElement(By.xpath("//div[contains(text(),\"We're doing everything we can to deliver a safe, h\")]"));
           BrowserUtils.wait(3);
           //this script will be scroll down till the link is visible
           //once link element will be visible,it will stop scrolling
           js1.executeScript("arguments[0].scrollIntoView(true)",link);
           //arguments[0] mean first element after coma(Link)
           BrowserUtils.wait(3);
//           System.out.println(link.getText());
//           link.click();
           BrowserUtils.wait(3);
           WebElement link1=driver.findElement(By.xpath("//ul[@class='d-none d-md-block']//a[@class='footernav-login-help'][contains(text(),'Login Help')]"));
           //this script will be scroll down till the link is visible
           //once link element will be visible,it will stop scrolling
           js1.executeScript("arguments[0].scrollIntoView(true)",link1);
           BrowserUtils.wait(3);
           System.out.println(link1.getText());
           link1.click();
           BrowserUtils.wait(3);
       }
    @Test(description = "scroll down and up")
    public void ScrollDownAndUp3() {
        driver.get("http://www.delta.com/");
        for(int i=0;i<5;i++){

        Actions action = new Actions(driver);
        BrowserUtils.wait(3);
        //SCROLL DOWN
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        BrowserUtils.wait(3);
    }
        //SCROLL UP
        // action.sendKeys(Keys.PAGE_UP).build().perform();
    }
    @AfterMethod
    public void teardown(){

        driver.close();
    }
}
