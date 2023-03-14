package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\joncastillo\\PracticeProjects\\Media-Tracker\\application\\web\\test\\src\\main\\java\\resource\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        assertEquals(title, "Web form");

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals(value, "Received!");

        driver.quit();
    }
}