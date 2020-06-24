package Selenium;

import Utils.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P1_DriverSetup {

    private WebDriver driver;
   // public static void main(String[] args) {


    //1-With System.setProperty

    //Set Property and pass chrome.driver exe path
   // System.setProperty("webdriver.chrome.driver","C:/Users/serka/eclipse-workspace/Batch15/chromedriver.exe");

    //Instantiate ChromeDriver
    //WebDriver driver=new ChromeDriver();

    //get URL
   //driver.get("http://google.com")   ;


    //2-by using WebDriverManager
//        @BeforeMethod
//        public void setup(){
//            WebDriverManager.chromedriver().setup();
//            ChromeDriver driver=new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            driver.get("http://google.com");
//
//        }

    //3-by using Browser Factory with WebDriverManager
//         @BeforeMethod
//       public void setup(){
//             driver= BrowserFactory.getDriver("chrome");
//             driver.manage().window().maximize();
//             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//             driver.get("http://google.com");
//         }


}
