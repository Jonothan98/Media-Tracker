package com.mediatracker.view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TrackerView {

    private static final String BASE_URL = "http://localhost:3000";
    private static final String DRIVER = "webdriver.chrome.driver";
    private static final String DRIVER_LOCATION = "C:\\Users\\joncastillo\\PracticeProjects\\Media-Tracker\\application\\web\\test\\src\\main\\java\\resource\\chromedriver.exe";

    private static WebDriver webDriver = null;


    protected TrackerView(String relativeUri) {
        System.setProperty(DRIVER, DRIVER_LOCATION);
        webDriver = new ChromeDriver();
        webDriver.get(String.format("%s/%s", BASE_URL, relativeUri));
    }

    protected WebElement getElementById(String locator_value){
        return webDriver.findElement(By.id(locator_value));
    }

    protected void closeDriver(){
        webDriver.quit();
    }
}
