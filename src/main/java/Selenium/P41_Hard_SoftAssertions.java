package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class P41_Hard_SoftAssertions {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
    }

   @Test
    public void hard_assertions(){

       String actual=driver.getTitle();
       String expected="Google";
            System.out.println(actual);
           // Assert.assertEquals(actual,expected);
           // Assert.assertTrue(true);
           Assert.assertTrue(false);
           System.out.println(actual);
        }

/*
   if there is critical point,we use hard assertions for check my code whether there is mistake or not
 */

    @Test
    public void soft_assertions(){

        String actual=driver.getTitle();
        String expected="Google";
        System.out.println(actual);

        SoftAssert sa=new SoftAssert();
        sa.assertTrue(true);
        System.out.println("soft assert return us no mistake");
        sa.assertTrue(false);
        sa.assertEquals(actual,expected);
        System.out.println("actual and expected are matched");
        sa.assertAll();//mean compare all assertion and log the fail.after assertAll nothing work
        System.out.println("assert all result");


        //if there is not critical or significant point we can use soft assertion
    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
