package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P18_FileUpload {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
    }
    @Test(description = "fileupload")
    public void fileupload(){
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        BrowserUtils.wait(3);
        driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[2]")).sendKeys("C:/Users/serka/OneDrive/Desktop/1.png");
        BrowserUtils.wait(3);
        String expectedresult="1.png";
        String actualresult=driver.findElement(By.xpath("//strong[@class='ng-binding']")).getText();
        Assert.assertEquals(actualresult,expectedresult);
        BrowserUtils.wait(3);
    }

    @Test(description = "fileupload")
    public void fileupload1(){
        driver.get("http://the-internet.herokuapp.com/upload");
        BrowserUtils.wait(3);
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/serka/OneDrive/Desktop/1.png");
        BrowserUtils.wait(3);
        driver.findElement(By.id("file-submit")).click();
        BrowserUtils.wait(3);
        String expectedresult="1.png";
        String actualresult=driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualresult,expectedresult);
        BrowserUtils.wait(3);
    }
    @AfterMethod
    public void teardown(){

        driver.close();
    }
}