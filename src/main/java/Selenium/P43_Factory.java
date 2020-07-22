package Selenium;

import Selenium.test.Ex1_forXml;
import Selenium.test.Ex2_forXml;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class P43_Factory {
    //marks a method as a factory that returns objects that will be used by test NG as a Test classes
    //The method must return object[]
    //factory used for run multiple test without xml

    @Test
    @Factory
    public Object[] factoryTest() {

        return new Object[]{
                new Ex1_forXml(),new Ex2_forXml(),new P42_getCssValue(),new P7_Checkbox()
        };
    }
}
