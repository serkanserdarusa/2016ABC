package Selenium.test;

import org.testng.annotations.Test;

public class Ex2_forXml {
    @Test
    public void test1(){
        System.out.println("number 11");
    }
    @Test
    public void test2(){
        System.out.println("number 22");
    }
    @Test(groups="hello")
    public void test3(){
        System.out.println("number 33");
    }
    @Test
    public void test4(){
        System.out.println("number 44");
    }
}
