package Selenium;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(P47_Listener.class)
public class P48_ListenerTestNgDemoClassLevel {


    @Test
    public void test1(){
        System.out.println("i am test 1");
        Assert.assertTrue(false);
    }

    @Test
    public void test2(){
        System.out.println("i am test 2");
    }


    @Test
    public void test3(){
        System.out.println("i am test 3");
       throw new SkipException("this will be skipped");
    }


    @Test
    public void test4(){
        System.out.println("i am test 4");
    }

}
