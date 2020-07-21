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

import java.util.List;
import java.util.concurrent.TimeUnit;

public  class P12_Actions_Mouse_MoveToElement {
    /*
    Actions class used with mouse and keyboard events
    Mouse events:

    click();
    doubleClick();
    clickAndHold();
    dragAndDrop();
    moveToElement();
    release();
    rightClick()==>contextClick();

    Keyboard events

    KeyUp();
    Keydown();
    Keys.Alt,Keys.Shift,Keys.Control


     */

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test(description ="move to element")
    public void movetoelement() {
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions action = new Actions(driver);
        List<WebElement> element = driver.findElements(By.xpath("//div[@class='example']/div"));
        BrowserUtils.wait(3);
        for (WebElement each : element) {
            action.moveToElement(each).perform();
            System.out.println(each.getText());
            BrowserUtils.wait(3);

        }
    }
          @Test(description ="move to element on amazon")
           public void movetoelement2(){
           driver.get("https://www.amazon.com/");
            Actions action1=new Actions(driver);
            BrowserUtils.wait(3);
            WebElement element1=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
            action1.moveToElement(element1).perform();
            BrowserUtils.wait(3);
            List<WebElement>el=driver.findElements(By.xpath("//div[@id='nav-al-your-account']/a"));

            for(WebElement each:el){
                action1.moveToElement(each).perform();
                BrowserUtils.wait(6);
                if(each.getText().equalsIgnoreCase("Your Garage")){
                    each.click();
                }
            }

            }














    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
