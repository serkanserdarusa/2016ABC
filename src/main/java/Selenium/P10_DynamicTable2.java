package Selenium;

import Utils.BrowserFactory;
import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P10_DynamicTable2 {
    private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://en.wikipedia.org/wiki/FIFA_Club_World_Cup");

    }



    @Test
    public void getColumn1(){
        List<WebElement> column = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[4]/div[1]/table[4]/tbody[1]/tr/td[1]"));
        for (WebElement cell : column) {
            System.out.println(cell.getText());
            BrowserUtils.wait(3);
            if (cell.getText().equalsIgnoreCase("Flamengo")) {
                BrowserUtils.wait(3);
                cell.click();
                BrowserUtils.wait(3);
            }
        }
    }
    @Test
    public void getcolumn2(){

        List<WebElement>el=driver.findElements(By.xpath("//html[1]/body[1]/div[3]/div[3]/div[4]/div[1]/table[4]/tbody[1]/tr/td[1]"));
        for(int i=0;i<el.size();i++){
            System.out.println(el.get(i).getText());
            BrowserUtils.wait(3);
            if(el.get(i).getText().equals("Flamengo")){
                BrowserUtils.wait(3);
                el.get(i).click();
                BrowserUtils.wait(3);
            }
        }
    }

    @Test
    public void getrow(){

        List<WebElement> row = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[4]/div[1]/table[4]/tbody[1]/tr[1]/td"));
            for (WebElement cell : row) {
                System.out.println(cell.getText());
                BrowserUtils.wait(3);
            }
        }

    @Test
    public void getAllInfo() {
        List<WebElement> row = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[4]/div[1]/table[4]/tbody[1]/tr/td"));
        for (WebElement cell : row) {
            System.out.println(cell.getText());
            BrowserUtils.wait(3);
        }
    }

    @Test
    public void getAllInfo2() {
        List<WebElement> row = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[4]/div[1]/table[4]/tbody[1]/tr"));
        for (WebElement cell : row) {
            System.out.println(cell.getText());
            BrowserUtils.wait(3); }}

    @AfterMethod
    public void teardown(){
        driver.close();


    }
}
