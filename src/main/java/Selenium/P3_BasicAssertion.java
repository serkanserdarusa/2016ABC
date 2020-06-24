package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class P3_BasicAssertion {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/serka/eclipse-workspace/Batch15/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        //first way

        String actual=driver.getTitle();
        String expected="Google";
        Assert.assertEquals(actual,expected);


        String actual1=driver.getCurrentUrl();
        String expected1="http://www.google.com";
        Assert.assertEquals(actual1,expected1);
        //second way

        if(expected.contains(actual)){
            System.out.println("passed");
        }else
            System.out.println("fail");




        driver.close();
    }


}
