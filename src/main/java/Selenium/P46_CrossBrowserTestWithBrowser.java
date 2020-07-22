package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P46_CrossBrowserTestWithBrowser {
    WebDriver driver;
    @Test
    @Parameters({"browser","url","email","password"})
    public void parametersTest(String browser,String url,String email,String password){


        if(browser.equals("msedge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            BrowserUtils.wait(3);
        }else if(browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            BrowserUtils.wait(3);
        }else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            BrowserUtils.wait(3);
        }

        driver.get(url);
        driver.findElement(By.id("email")).sendKeys(email);
        BrowserUtils.wait(3);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}
