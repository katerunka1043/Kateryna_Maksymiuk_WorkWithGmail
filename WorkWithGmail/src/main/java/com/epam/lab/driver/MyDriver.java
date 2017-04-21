package com.epam.lab.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.concurrent.TimeUnit;


public class MyDriver {
   private static WebDriver mDriver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public MyDriver() {
    }
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver.set(new ChromeDriver());
            driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver.get();
    }

    public static void getUrl(String URL) {
        driver.get().get(URL);
    }

    public static void tearDown() {
        if(driver.get()!=null) {
            driver.get().close();
            driver.get().quit();
            driver.remove();
        }
    }
}
