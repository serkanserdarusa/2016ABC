package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_GetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/serka/eclipse-workspace/Batch15/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
        System.out.println(element.getAttribute("id"));
        WebElement element1=driver.findElement(By.name("field-keywords"));
        System.out.println(element1.getAttribute("name"));
        driver.close();
        
    }

}
