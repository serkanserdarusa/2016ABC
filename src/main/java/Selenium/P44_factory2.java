package Selenium;

import Selenium.test.Ex1_forXml;
import Selenium.test.Ex2_forXml;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class P44_factory2 {

    @Test
    @Factory
    public Object[] factoryTest() {

        Object[] tests=new Object[4];
        tests[0]=new Ex1_forXml();
        tests[1]=new Ex2_forXml();
        tests[2]=new P42_getCssValue();
        tests[3]=new P7_Checkbox();
        return tests;
    };
    }



