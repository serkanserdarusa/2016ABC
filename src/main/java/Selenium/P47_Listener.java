package Selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class P47_Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("==test started=="+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("==test seccessed=="+result.getName());
    }


    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("==test failed=="+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("==test skipped=="+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("==test completed=="+context.getName());
    }
    /*
    listener(it is a interface) help us understanding result of the execution
    This interface contains various callback methods that let you keep track of whether test pass,fail,skip.....
     */

}
