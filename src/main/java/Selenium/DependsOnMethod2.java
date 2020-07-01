package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod2 {

    @Test(priority = 1)
    public void firstTest() {
        System.out.println("First Test");
        Assert.fail();
    }

    @Test(priority = 2, dependsOnMethods = {"firstTest"})
    public void secondTest() {
        System.out.println("Second Test");
    }

    @Test(priority = 3, dependsOnMethods = {"firstTest"})
    public void thirdTest() {
        System.out.println("Third Test");
    }

    @Test(priority = 4, dependsOnMethods = {"firstTest"})
    public void fourthTest() {
        System.out.println("Fourth Test");
    }


}


