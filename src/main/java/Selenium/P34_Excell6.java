package Selenium;

import Utils.BrowserUtils;
import Utils.ExcellUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class P34_Excell6 {
    public static void main(String[] args) throws IOException {

        ExcellUtils ex = new ExcellUtils("C:/Users/serka/OneDrive/Desktop/practice.xlsx");
        String firstname=ex.getdata(1,0);
        System.out.println(firstname);
        String lastname=ex.getdata(1,1);
        System.out.println(lastname);
        String email=ex.getdata(1,2);
        System.out.println(email);
        String reemail=ex.getdata(1,3);
        System.out.println(reemail);
        String password=ex.getdata(1,4);
        System.out.println(password);


        System.setProperty("webdriver.chrome.driver","C:/Users/serka/eclipse-workspace/Batch15/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");

        driver.findElement(By.id("u_0_m")).sendKeys(firstname);
        BrowserUtils.wait(3);
        driver.findElement(By.id("u_0_o")).sendKeys(lastname);
        BrowserUtils.wait(3);
        driver.findElement(By.id("u_0_r")).sendKeys(email);
        BrowserUtils.wait(3);
        driver.findElement(By.id("u_0_u")).sendKeys(reemail);
        BrowserUtils.wait(3);
        driver.findElement(By.id("u_0_w")).sendKeys(password);
        BrowserUtils.wait(3);


    }
}