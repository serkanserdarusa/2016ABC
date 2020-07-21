package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class P27_Screenshoot2 {
    WebDriver driver;

    @BeforeMethod
    public void test() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://app.hubspot.com/login");

    }

    @Test
    public void Takescreenshoot() throws IOException {

        WebElement email=driver.findElement(By.id("username"));
        email.sendKeys("batch15@gmail.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("123456");
        WebElement loginbutton=driver.findElement(By.id("loginBtn"));
        loginbutton.click();

        TakesScreenshot srcshot=((TakesScreenshot)driver);

        File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile,new File("./test-output/Screenshoot/wholepage.png"));
    }
}
