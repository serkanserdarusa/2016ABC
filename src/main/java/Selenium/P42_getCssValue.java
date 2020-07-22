package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P42_getCssValue {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com");
    }

  @Test
  public void AmazonTest(){

      WebElement element=driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));

      String font=element.getCssValue("font-size");
      System.out.println("font-size is: "+font);

      String color=element.getCssValue("color");
      System.out.println("color is: "+color);

      String box_sizing=element.getCssValue("box-sizing");
      System.out.println("box-sizing is : "+box_sizing);

      String font_family=element.getCssValue("font-family");
      System.out.println("font-family is: "+font_family);

      String background_color=element.getCssValue("background-color");
      System.out.println("background-size is: "+background_color);

      String line_height=element.getCssValue("line-height");
      System.out.println("line height is: "+line_height);

      String font_height=element.getCssValue("font-height");
      System.out.println("font-height is: "+font_height);

      String font_weight=element.getCssValue("font-weight");
      System.out.println("font-weight is: "+font_weight);

      String vertical_align=element.getCssValue("vertical-align");
      System.out.println("verical_align is: "+vertical_align);

      String webkit_text_size_adjust=element.getCssValue("webkit-text-size-adjust");
      System.out.println("webkit_text_size_adjust is: "+webkit_text_size_adjust);

  }


















    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
