package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    /**
     *      SINGLETON DRIVER CLASS
     *
     *  -We're using singleton driver because we need 1 driver for every class in our project
     *
     */


    private static WebDriver driver;

    public static WebDriver getDriver() {
        // if the driver object is equal to null (there is no active driver instance) then we'll create a new driver instance
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // if we don't have this line next scenario will fail
                           // after driver.quit we need to set driver object to null
        }
    }

}
