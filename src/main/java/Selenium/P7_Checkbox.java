package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P7_Checkbox {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");

    }

    @Test
    public void test1(){
        List<WebElement> elements=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input"));
        for(WebElement each:elements){
            BrowserUtils.wait(2);
            each.click();
            BrowserUtils.wait(2);
        }
    }

    @Test
    public void test2(){
        List<WebElement> elements=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[6]/input"));
        for(WebElement each:elements) {
            if (each.isSelected()) {
                BrowserUtils.wait(2);
                each.click();
                BrowserUtils.wait(2);
            }
        }

        for(WebElement each1:elements){
            if(each1.isDisplayed()&&!each1.isSelected()){
                BrowserUtils.wait(2);
                each1.click();
            }
            System.out.println(each1.isSelected());
            System.out.println(each1.isEnabled());
            System.out.println(each1.isDisplayed());
            BrowserUtils.wait(2);

        }
    }
    /*
    for check the visibility of the element  we use
    ==>isDisplayed()==>check if element is displayed or not.return true or false
    ==>isEnabled()==>check if element is enabled or not.return true or false
    ==>isSelected()==>check if element is selected or not.return true or false


     */

    @AfterMethod
    public void teardown(){
        driver.close();
        //System.exit(0);

    }
}
