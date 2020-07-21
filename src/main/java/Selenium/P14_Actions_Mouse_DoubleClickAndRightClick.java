package Selenium;

import Utils.BrowserFactory;
import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P14_Actions_Mouse_DoubleClickAndRightClick {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.uitestpractice.com/Students/Actions");

    }
    @Test(description ="single click")
    public void singleclick() {

        WebElement element=driver.findElement(By.name("click"));
        BrowserUtils.wait(2);
        Actions action=new Actions(driver);
        BrowserUtils.wait(2);
        action.moveToElement(element).click().build().perform();
        BrowserUtils.wait(2);
    }

    @Test(description ="double click")
    public void doubleclick() {

   WebElement element=driver.findElement(By.name("dblClick"));
        BrowserUtils.wait(2);
        Actions action=new Actions(driver);
        BrowserUtils.wait(2);
        action.moveToElement(element).doubleClick().build().perform();
        BrowserUtils.wait(2);
    }

    @Test(description ="right click")
    public void Rightclick() {

        WebElement element=driver.findElement(By.name("click"));
        BrowserUtils.wait(2);
        Actions action=new Actions(driver);
        BrowserUtils.wait(2);
        action.moveToElement(element).contextClick().build().perform();
        BrowserUtils.wait(2);
    }



    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
