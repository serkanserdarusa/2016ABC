package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class P26_Screenshoot1 {

    WebDriver driver;

    @BeforeMethod
    public void test() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/html/html_tables.asp");


    }
    @Test
    public void takeScreenshoot() throws IOException {
        WebElement table=driver.findElement(By.id("customers"));
        File srcFile=table.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("./test-output/Screenshoot/webtable.png"));

    }
}
