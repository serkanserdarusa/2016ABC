package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P45_Parameters {

    WebDriver driver;
    @Test
    @Parameters({"browser","url","email","password"})
    public void parametersTest(String browser,String url,String email,String password){

        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        System.out.println(browser);
        driver.get(url);
        driver.findElement(By.id("email")).sendKeys(email);
        BrowserUtils.wait(3);
        driver.findElement(By.id("pass")).sendKeys(password);
    }


}
