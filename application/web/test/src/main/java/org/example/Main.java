package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\joncastillo\\PracticeProjects\\Media-Tracker\\application\\web\\test\\src\\main\\java\\resource\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
    }
}