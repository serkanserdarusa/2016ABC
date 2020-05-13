package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class BrowserUtils {



        //It will be used to pause our test execution

        //just provide number of seconds as a parameter

        public static void wait(int seconds) {

            try {

                Thread.sleep(1000 * seconds);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }


        /**
         * Waits for element to be not stale
         *
         * @param element
         */

        public static void waitForStaleElement(WebElement element) {

            int y = 0;

            while (y <= 15) {

                try {

                    element.isDisplayed();

                    break;

                } catch (StaleElementReferenceException st) {

                    y++;

                    try {

                        Thread.sleep(200);

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

                break;

            }

        }


        /**
         * Waits for the provided element to be visible on the page
         *
         * @param element
         * @param timeToWaitInSec
         * @return
         */

        public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {

            WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);

            return wait.until(ExpectedConditions.visibilityOf(element));

        }


        /**
         * Clicks on an element using JavaScript
         *
         * @param element
         */

        public static void clickWithJS(WebElement element) {

            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);

            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);

        }


        /**
         * Waits for provided element to be clickable
         *
         * @param element
         * @param timeout
         * @return
         */

        public static WebElement waitForClickablility(WebElement element, int timeout) {

            WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);

            return wait.until(ExpectedConditions.elementToBeClickable(element));

        }


//    PLEASE INSERT THIS METHOD INTO BROWSER UTILS

        /*

         * takes screenshot

         * @param name

         * take a name of a test and returns a path to screenshot takes

         */

        public static String getScreenshot(String name) {

            // name the screenshot with the current date time to avoid duplicate name

//        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));​

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm");

            String date = df.format(new Date());

            // TakesScreenshot ---> interface from selenium which takes screenshots

            TakesScreenshot ts = (TakesScreenshot) Driver.get();

            File source = ts.getScreenshotAs(OutputType.FILE);

            // full path to the screenshot location

            //where screenshot will be stored

            //System.getProperty("user.dir") returns path to the project as a string

            String target = System.getProperty("user.dir") + "\\test-output\\Screenshots\\" + name + date + ".png";

            File finalDestination = new File(target);

            // save the screenshot to the path given

            try {

                FileUtils.copyFile(source, finalDestination);

            } catch (IOException e) {

                e.printStackTrace();

            }

            return target;

        }


    }
