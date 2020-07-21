package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class P28_Screenshoot3 {
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

        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("batch15@gmail.com");
        BrowserUtils.wait(1);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");
        BrowserUtils.wait(1);
        WebElement loginbutton = driver.findElement(By.id("loginBtn"));
        BrowserUtils.wait(1);
        WebElement all = driver.findElement(By.id("hs-login"));
        BrowserUtils.wait(1);
        WebElement afterall = driver.findElement(By.id("hs-login"));


        TakeElementscreenshoot(email,"emailsrc");
        BrowserUtils.wait(1);
        TakeElementscreenshoot(password,"passwordsrc");
        BrowserUtils.wait(1);
        TakeElementscreenshoot(loginbutton,"loginsrc");
        BrowserUtils.wait(1);
        TakeElementscreenshoot(all,"beforeallsrc");
        loginbutton.click();
        BrowserUtils.wait(1);
        TakeElementscreenshoot(afterall,"afterallsrc");
        BrowserUtils.wait(1);
    }

    @Test
    public void TakeElementscreenshoot(WebElement element,String filename) throws IOException {


        TakesScreenshot srcshot=((TakesScreenshot)element);

        File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile,new File("./test-output/Screenshoot/"+filename+".png"));
    }
}