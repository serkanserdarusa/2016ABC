package Selenium;

import Utils.BrowserFactory;
import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P9_DynamicTable {

    private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
    }

    @Test
    public void getRow(){
        List<WebElement> row=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]/td"));
        for(WebElement each:row){
            BrowserUtils.wait(2);
            System.out.println(each.getText());
            BrowserUtils.wait(2);
        }
    }
    @Test
    public void getRow1(){
        List<WebElement> row1=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]"));
        for(WebElement each:row1){
            BrowserUtils.wait(2);
            System.out.println(each.getText());
            BrowserUtils.wait(2);
        }
    }
    @Test
    public void getrow2(){
        List<WebElement> row1=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        for(WebElement each:row1) {
            BrowserUtils.wait(2);
            System.out.println(each.getText());
            BrowserUtils.wait(2);
        }
    }

    @Test
    public void getcolumn() {
        List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr/td[1]"));
        for (WebElement each : col) {
            BrowserUtils.wait(2);
            System.out.println(each.getText());
            BrowserUtils.wait(2);


        }

    }

    @Test
    public void getalloptions() {
        List<WebElement> all = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/table[1]"));
        for (WebElement each : all) {
            BrowserUtils.wait(2);
            System.out.println(each.getText());
            BrowserUtils.wait(2);

        }
    }

    @Test
    public void getheader() {
        List<WebElement> head = driver.findElements(By.xpath("//table[@id='table1']//th"));
        for (WebElement each : head) {
            BrowserUtils.wait(2);
            System.out.println(each.getText());
            BrowserUtils.wait(2);


        }

    }

    @Test
    public void getcolumn1(){
        String before="//table[@id='table1']//tbody//tr[";
        String after="]/td[1]";
        for(int i=1;i<=4;i++){
            String xpath=before+i+after;
            WebElement element=driver.findElement(By.xpath(xpath));
            System.out.println(element.getText());
        }
    }

    @Test
    public void getrow3(){
        String before="//table[@id='table1']//tbody//tr[1]/td[";
        String after="]";
        for(int i=1;i<=6;i++){
            String xpath=before+i+after;
            WebElement element=driver.findElement(By.xpath(xpath));
            System.out.println(element.getText());
        }
    }

    @AfterMethod
    public void teardown(){
        driver.close();


    }

}
