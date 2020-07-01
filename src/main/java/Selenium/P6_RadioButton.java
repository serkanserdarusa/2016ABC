package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P6_RadioButton {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.tizag.com/htmlT/htmlradio.php");

    }

    @Test
    public void test1(){

        List<WebElement> element=driver.findElements(By.xpath("//body//div[4]/input"));//table[@class='main']//form[1]//input

        for(WebElement each:element){
           BrowserUtils.wait(2);
            each.click();
           BrowserUtils.wait(2);
        }



    }
    @Test
    public void test2(){

        List<WebElement> element=driver.findElements(By.xpath("//table[@class='main']//form[1]//input"));

//        for(WebElement each:element){
//            BrowserUtils.wait(2);
//            each.click();
//            BrowserUtils.wait(2);
//        }

        for(WebElement each:element){
            if(!each.isSelected()){
                BrowserUtils.wait(2);
                each.click();
                BrowserUtils.wait(2);
            }
            System.out.println(each.isSelected());
            System.out.println(each.isEnabled());
            System.out.println(each.isDisplayed());
        }
        
    }

    @AfterMethod
    public void teardown(){
        driver.close();
        //System.exit(0);

    }
}
