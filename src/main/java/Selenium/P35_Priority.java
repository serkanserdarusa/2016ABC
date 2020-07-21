package Selenium;

import org.testng.annotations.Test;

public class P35_Priority {

    //it determines which test will be run first
    @Test
    public void test1(){
        System.out.println("number of test 1");
    }
    @Test(priority = 4)
    public void test2(){
        System.out.println("number of test 2");
    }
    @Test(priority = 2)
    public void test3(){
        System.out.println("number of test 3");
    }
    @Test(priority = 3)
    public void test4(){
        System.out.println("number of test 4");
    }
}


