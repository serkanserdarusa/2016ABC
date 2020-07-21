package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class P21_SwitchWindow2 {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.google.com");

    }


    @Test(description ="windows switching")
    public void switchWindows(){

        driver.findElement(By.linkText("About")).click();

        BrowserUtils.wait(3);

        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/section[13]/div[1]/a[1]")).click();

        BrowserUtils.wait(3);

        String oldwindow=driver.getWindowHandle();//old window's id
        System.out.println(oldwindow);
        System.out.println(driver.getTitle());

        Set<String> set=driver.getWindowHandles();
        int count=set.size();
        System.out.println(count);
        System.out.println(set);

  for( String each:set){
      if(!each.equals(oldwindow)){
          driver.switchTo().window(each);
          System.out.println(driver.getTitle());
          System.out.println(driver.getWindowHandle());
          BrowserUtils.wait(3);
      }
  }

         driver.switchTo().window(oldwindow);
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());

    }

    @AfterMethod
    public void teardown(){

        driver.close();
    }
}
