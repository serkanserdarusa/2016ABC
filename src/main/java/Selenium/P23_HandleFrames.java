package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P23_HandleFrames {
    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }


    @Test(description ="handles frames")
    public void frame1(){
    driver.get("http://practice.cybertekschool.com/frames");
    driver.findElement(By.linkText("iFrame")).click();

        BrowserUtils.wait(3);
    WebElement el=driver.findElement(By.id("mce_0_ifr"));
    driver.switchTo().frame(el);
        System.out.println(driver.getTitle());
        WebElement textarea=driver.findElement(By.id("tinymce"));
        BrowserUtils.wait(3);
        String expectedresult="Your content goes here.";
        String actualresult=textarea.getText();
        Assert.assertEquals(actualresult,expectedresult);
        BrowserUtils.wait(3);
        textarea.clear();
        BrowserUtils.wait(3);
        textarea.sendKeys("I removed previous text and enter new one");
        BrowserUtils.wait(3);
        String expectedresult1="I removed previous text and enter new one";
        String actualresult1=textarea.getText();
        Assert.assertEquals(actualresult1,expectedresult1);
        BrowserUtils.wait(3);
        driver.switchTo().defaultContent();//it goes main page
        //textarea.sendKeys("hello");this is not work because we are not in the frame

        int numberofframe=driver.findElements(By.tagName("iframe")).size();
        System.out.println(numberofframe);

    }






    @AfterMethod
    public void teardown(){
        driver.close();
    }

}
