package Selenium;

import Utils.BrowserUtils;
import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class P20_SwitchWindow1 {
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
        //every page has id or windowhandle.
driver.findElement(By.linkText("About")).click();
    System.out.println(driver.getWindowHandle());//parent's window id.we did not switch yet
    BrowserUtils.wait(3);

driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/section[13]/div[1]/a[1]")).click();
    System.out.println(driver.getWindowHandle());//parent's window id.we did not switch yet
    BrowserUtils.wait(3);

driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
    System.out.println(driver.getWindowHandle());//parent's window id.we did not switch yet
    BrowserUtils.wait(3);

    Set<String> set=driver.getWindowHandles();
    System.out.println(set);

    Iterator<String>it=set.iterator();
    String parent=it.next();
    String child=it.next();
    String grandchild=it.next();
    BrowserUtils.wait(3);

    System.out.println(driver.getTitle());
    System.out.println(driver.getWindowHandle());
    System.out.println("===============");
    driver.switchTo().window(child);
    System.out.println(driver.getTitle());
    System.out.println(driver.getWindowHandle());
    System.out.println("===============");
    driver.switchTo().window(grandchild);
    System.out.println(driver.getTitle());
    System.out.println(driver.getWindowHandle());
    System.out.println("===============");
    driver.switchTo().window(parent);
    System.out.println(driver.getTitle());
    System.out.println(driver.getWindowHandle());
    BrowserUtils.wait(3);
}

//driver just focus on first window







    @AfterMethod
    public void teardown(){

        driver.close();
    }
}
