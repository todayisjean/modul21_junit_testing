package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver _driver;

    public static WebDriver getDriver() {
        if(_driver == null)
            _driver = new ChromeDriver();
        return _driver;
    }

    public static void quitDriver() {
        _driver.quit();
        _driver = null;
    }
}
