package Selenium;

import Utils.BrowserFactory;
import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P15_Actions_Keyboard_KeyTab {

    private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://ankpro.com/Account/Register");

    }

   @Test
   public void KeyTab1(){
        Actions act=new Actions(driver);
       WebElement element=driver.findElement(By.id("Email"));
       BrowserUtils.wait(3);
       act.click(element)
               .sendKeys("hello@gmail.com", Keys.TAB)
               .sendKeys("123456", Keys.TAB)
               .sendKeys("123456", Keys.TAB)
               .sendKeys(Keys.ENTER).build().perform();
       BrowserUtils.wait(3);
   }


    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
