package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class P11_Alert_Pop_ups {
    /*
    Alert is interface
    Simple Alert:A simple alert just has an ok button.we will use accept().
    Confirmation Alert=This type of alert comes with an option.accept(),dismiss().
    Prompt Alert=there is  text field.after sendKeys() we will use accept(),dismiss().
    Alert alert=driver.switchTo().alert();
     */
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");

    }
    @Test(description ="Basic alert")
    public void pop_ups1(){
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(3);
        System.out.println(alert.getText());
        alert.accept();
        BrowserUtils.wait(3);
        String actual=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expected="You successfuly clicked an alert";
        Assert.assertEquals(actual,expected);
    }
    @Test(description ="Confirmation alert")
    public void pop_ups2(){
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(3);
        System.out.println(alert.getText());
        alert.dismiss();
        BrowserUtils.wait(3);
        String actual=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expected="You clicked: Cancel";
        Assert.assertEquals(actual,expected);
    }
    @Test(description ="prompt alert")
    public void pop_ups3(){
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(3);
        System.out.println(alert.getText());
        driver.switchTo().alert().sendKeys("Hello everyone");
        driver.switchTo().alert().accept();
        BrowserUtils.wait(3);
        String actual=driver.findElement(By.xpath("//p[@id='result']")).getText();
        BrowserUtils.wait(3);
        String expected="You entered: Hello everyone";
        Assert.assertEquals(actual,expected);

    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
