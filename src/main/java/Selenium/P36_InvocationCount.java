package Selenium;

import Utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class P36_InvocationCount {

    //invocation mean method will run 6 times
    @Test(invocationCount = 6,timeOut = 100000)
    public void test1(){

        System.out.println("hello");
    }

    @Test(threadPoolSize = 2,invocationCount = 6,timeOut = 100000)
    //invocationCount:how many times testNg run this test method
    //threadPoolSize:how many number thread run this test method
    public void test2(){
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
    }

}
