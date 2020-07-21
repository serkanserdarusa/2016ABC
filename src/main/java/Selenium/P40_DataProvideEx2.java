package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P40_DataProvideEx2 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

    }

    @Test(dataProvider = "testdata")
    public void test(String email, String password) {

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
        BrowserUtils.wait(2);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]")).click();

        System.out.println(email);
        System.out.println(password);

    }

    @DataProvider(name = "testdata")
    public Object[][] getData() {

        Object[][] data = new Object[3][2];

        //first row
        //(row 0 column 0)
        data[0][0] = "mike@gmail.com";
        //(row 0 column 1)
        data[0][1] = "mike123";

        //second row(
       // (row 1 column 0)
        data[1][0] = "john@gmail.com";
        // (row 1 column 1)
        data[1][1] = "john1234";


        //third row
       // (row 2 column 0)
        data[2][0] = "scott@gmail.com";
        // (row 2 column 1)
        data[2][1] = "scott12345";

      return data;
    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
