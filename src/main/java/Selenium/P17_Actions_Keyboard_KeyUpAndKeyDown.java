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

public class P17_Actions_Keyboard_KeyUpAndKeyDown {

    private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");

    }

    @Test
    public void KeyTab1(){
        WebElement element=driver.findElement(By.name("q"));
        Actions act=new Actions(driver);
        act.keyDown(element,Keys.SHIFT);
        act.sendKeys(element,"box");
        act.keyUp(element,Keys.SHIFT);
        act.perform();
        BrowserUtils.wait(3);

       // keyDown means press the button which is SHIFT
    }

    @Test
    public void KeyTab2(){
        WebElement element=driver.findElement(By.name("q"));
        Actions act=new Actions(driver);
        act.keyUp(element,Keys.SHIFT).sendKeys(element,"box").keyDown(element,Keys.SHIFT).build().perform();
        //act.keyDown(Keys.SHIFT).sendKeys("box").keyUp(Keys.SHIFT).build().perform();
        BrowserUtils.wait(3);

        // keyDown means press the button which is SHIFT
    }


    @AfterMethod
    public void teardown(){

        driver.close();
    }
}
