package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P24_HandleFrames2 {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://popuptest.com/goodpopups.html");

    }

    @Test(description = "iFrame example")
    public void test3() {
        driver.get("https://www.dezlearn.com/testingpage/");
        int total_iframe=driver.findElements(By.tagName("iframe")).size();
        System.out.println(total_iframe);
        BrowserUtils.wait(3);
        driver.switchTo().frame(driver.findElement(By.id("do-it-iframe")));
        BrowserUtils.wait(3);
        driver.findElement(By.name("s")).sendKeys("hello", Keys.ENTER);
        BrowserUtils.wait(3);
        driver.switchTo().defaultContent();
        BrowserUtils.wait(3);
        driver.switchTo().frame(driver.findElement(By.name("queries-iframe")));
        BrowserUtils.wait(3);
        driver.findElement(By.id("ninja_forms_field_11")).sendKeys("ahmed");
        BrowserUtils.wait(3);
        driver.findElement(By.id("ninja_forms_field_12")).sendKeys("ahmed@gmail.com");
        BrowserUtils.wait(3);

        driver.findElement(By.id("ninja_forms_field_13")).sendKeys("Hello guys");
        BrowserUtils.wait(3);
        driver.findElement(By.id("ninja_forms_field_14")).click();
        BrowserUtils.wait(3);
        driver.switchTo().defaultContent();
        //we can only switch one at a time, cannot switch to grandchild directly.
        //cannot switch to siblings, only parent to child

    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
