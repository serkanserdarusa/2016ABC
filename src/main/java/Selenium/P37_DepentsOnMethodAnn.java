package Selenium;

import org.testng.annotations.Test;

public class P37_DepentsOnMethodAnn {


    @Test(groups = "hi")
    public void test1(){

        System.out.println("Number of test is 111 ");
    }
    @Test
    public void test2(){
        System.out.println("Number of test is 222 ");

    }
    @Test(dependsOnMethods = {"test1","test2"})
    public void test3(){
        System.out.println("Number of test is 333 ");
    }

    @Test(dependsOnGroups ={"hi"})
    public void test4(){
        System.out.println("Number of test is 444 ");

    }
}
