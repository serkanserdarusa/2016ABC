package Selenium;

import Utils.BrowserFactory;
import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P13_Actions_Mouse_DragAnddrop {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

    }

    @Test(description ="drag and drop")
    public void draganddrop1() {
       Actions action=new Actions(driver);
       WebElement circle=driver.findElement(By.id("draggable"));
       WebElement target=driver.findElement(By.id("droptarget"));
       BrowserUtils.wait(2);
       action.dragAndDrop(circle,target).perform();
      //perform use for execution
        BrowserUtils.wait(2);

        }
    @Test(description ="drag and drop")
    public void draganddrop2() {
        Actions action=new Actions(driver);
        WebElement circle=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));
        BrowserUtils.wait(2);
        action.clickAndHold(circle).moveToElement(target).release().build().perform();
        //perform use for execution
        //build use create chain of actions
        BrowserUtils.wait(2);

        String actual=driver.findElement(By.id("droptarget")).getText();
        String expected="You did great!";
        Assert.assertEquals(actual,expected);

    }




}
