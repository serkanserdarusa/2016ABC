package Selenium;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_NavigateTo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/serka/eclipse-workspace/Batch15/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        BrowserUtils.wait(2);
        System.out.println(driver.getTitle());
        driver.get("http://www.amazon.com");
        BrowserUtils.wait(2);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        BrowserUtils.wait(2);
        driver.navigate().refresh();
        BrowserUtils.wait(2);
        driver.navigate().forward();
    }
}
