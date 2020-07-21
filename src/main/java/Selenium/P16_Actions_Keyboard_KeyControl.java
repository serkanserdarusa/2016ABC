package Selenium;

import Utils.BrowserFactory;
import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P16_Actions_Keyboard_KeyControl {
    private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.uitestpractice.com/Students/Actions");

    }

    @Test
    public void KeyControl1(){

        Actions act=new Actions(driver);
        BrowserUtils.wait(3);
        act.keyDown(driver.findElement(By.xpath("//li[@name='nine']")),Keys.CONTROL)
           .keyDown(driver.findElement(By.xpath("//li[@name='ten']")),Keys.CONTROL)
           .keyDown(driver.findElement(By.xpath("//li[@name='eleven']")),Keys.CONTROL)
           .keyDown(driver.findElement(By.xpath("//li[@name='twelve']")),Keys.CONTROL)
                .build().perform();
        BrowserUtils.wait(3);
    }
    @Test
    public void KeyControl2(){
    List<WebElement> element=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
    for(WebElement each:element){
        Actions act=new Actions(driver);
        act.keyDown(each,Keys.CONTROL).build().perform();
        BrowserUtils.wait(3);
    }
    }
    @Test
    public void KeyControl3(){

        String before="//ol[@id='selectable']/li[";
        String after="]";
        for(int i=1;i<=12;i++){
            String xpath=before+i+after;
            WebElement element=driver.findElement(By.xpath(xpath));
            Actions act=new Actions(driver);
            act.keyDown(element,Keys.CONTROL).build().perform();
        }
        BrowserUtils.wait(6);
             }



    @Test
    public void KeyControl4(){

       List<WebElement> el=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
        String before="//ol[@id='selectable']/li[";
        String after="]";
        for(int i=1;i<=el.size();i++){
            String xpath=before+i+after;
            WebElement element=driver.findElement(By.xpath(xpath));
            Actions act=new Actions(driver);
            act.keyDown(element,Keys.CONTROL).build().perform();
            System.out.println(element.getText());
        }
        BrowserUtils.wait(6);
    }

    @Test
    public void KeyControl5() {

        List<WebElement> el = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
        String before = "//ol[@id='selectable']/li[";
        String after = "]";
        for (int i = 1; i <=el.size(); i++) {
                String xpath = before + i + after;
                WebElement element = driver.findElement(By.xpath(xpath));
            if (el.get(i).getText().equals("3") || el.get(i).getText().equals("6")) {
                Actions act = new Actions(driver);
                act.keyDown(element, Keys.CONTROL).build().perform();
            }
            BrowserUtils.wait(6);
        }
        System.out.println(el.size());
    }

    @AfterMethod
    public void teardown(){

        driver.close();
    }
}
