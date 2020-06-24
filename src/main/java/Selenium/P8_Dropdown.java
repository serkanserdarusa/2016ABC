package Selenium;


import Utils.BrowserFactory;
import Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P8_Dropdown {
private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
    }

    @Test
    public void dropdown(){
        //single-select dropdown
        WebElement element=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select s1=new Select(element);
        BrowserUtils.wait(3);
        s1.selectByVisibleText("Option 2");
        BrowserUtils.wait(3);
        //s1.getFirstSelectedOption();

        WebElement element1=driver.findElement(By.xpath("//select[@id='year']"));
        Select s2=new Select(element1);
        BrowserUtils.wait(3);
        s2.selectByValue("2016");
        BrowserUtils.wait(3);

        WebElement element2=driver.findElement(By.xpath("//select[@id='month']"));
        Select s3=new Select(element2);
        BrowserUtils.wait(3);
        s3.selectByIndex(3);
        BrowserUtils.wait(3);

        WebElement element3=driver.findElement(By.xpath("//select[@id='day']"));
        Select s4=new Select(element3);
        BrowserUtils.wait(3);
        s4.selectByVisibleText("24");
        BrowserUtils.wait(3);

        WebElement element4=driver.findElement(By.xpath("//select[@id='state']"));
        Select s5=new Select(element4);
        BrowserUtils.wait(3);
        System.out.println(s5.getFirstSelectedOption().getText());
        s5.selectByVisibleText("Georgia");
        System.out.println(s5.getFirstSelectedOption().getText());
        BrowserUtils.wait(3);

        //multi-select dropdown
        WebElement element5=driver.findElement(By.xpath("//select[@name='Languages']"));
        Select s6=new Select(element5);
        BrowserUtils.wait(3);
       s6.selectByVisibleText("JavaScript");
        BrowserUtils.wait(3);
//         s6.selectByVisibleText("Java");//select Java
//        BrowserUtils.wait(3);
//         s6.deselectByVisibleText("Java");//deselect Java
//        BrowserUtils.wait(3);

        //getOptions
        List<WebElement> el=s6.getOptions();
        for (WebElement each:el) {
            System.out.println(each.getText());


        }

        WebElement element6=driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        element6.click();
        BrowserUtils.wait(3);
        List<WebElement>el1=driver.findElements(By.xpath("//*[@id='content']/div/div/a"));
        BrowserUtils.wait(3);
        for(WebElement each:el1){
            BrowserUtils.wait(3);
            System.out.println(each.getText());
            BrowserUtils.wait(3);
            if(each.getText().equalsIgnoreCase("Etsy")){
                each.click();
                BrowserUtils.wait(3);
            }
        }

    }

    @AfterMethod
    public void teardown(){
        driver.close();
        //System.exit(0);

    }


}
