package com.syntax.class28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/vitalinashershan/Desktop/Selenium/chromedriver");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.apple.com/iphone/");
    }
}
