package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P25_NestedFrames {
    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }
    @Test(description ="handles frames")
    public void frame2() {
        driver.get("http://practice.cybertekschool.com/frames");
        driver.findElement(By.linkText("Nested Frames")).click();
        BrowserUtils.wait(3);

        driver.switchTo().frame("frame-top");
        BrowserUtils.wait(3);
        driver.switchTo().frame("frame-left");
        BrowserUtils.wait(3);
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        BrowserUtils.wait(3);
        driver.switchTo().frame("frame-top");
        BrowserUtils.wait(3);
        driver.switchTo().frame("frame-middle");
        BrowserUtils.wait(3);
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        BrowserUtils.wait(3);
        driver.switchTo().frame("frame-right");
        BrowserUtils.wait(3);
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.name("frame-bottom")));
        System.out.println(driver.findElement(By.tagName("body")).getText());

    }
        @AfterMethod
    public void teardown(){
        driver.close();
    }
}
