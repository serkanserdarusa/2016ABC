package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class P22_SwitchWindow3 {

        private WebDriver driver;

        @BeforeMethod
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("http://popuptest.com/goodpopups.html");

        }

        @Test
        public void test() {
            driver.findElement(By.xpath("//a[@class='black']")).click();
            BrowserUtils.wait(5);

//    String parent=driver.getWindowHandle();
//        System.out.println(parent);
//        System.out.println(driver.getTitle());

            Set<String> set = driver.getWindowHandles();//window id's/window handles

            Iterator<String> it = set.iterator();

            while (it.hasNext()) {
                String parent1 = it.next();
                String child = it.next();

                if (!parent1.equalsIgnoreCase(child)) {

                    driver.switchTo().window(child);
                    System.out.println(driver.getWindowHandle());
                    System.out.println(driver.getTitle());

                    driver.close();
                }
                driver.switchTo().window(parent1);
                System.out.println(driver.getWindowHandle());
                System.out.println(driver.getTitle());
                driver.close();
            }


        }
    }




