package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/vitalinashershan/Desktop/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title match");
        } else {
            System.out.println("Title don't match");
        }
        driver.findElement(By.linkText("Logout")).click();
       Thread.sleep(2000);
        driver.quit();
    }
}