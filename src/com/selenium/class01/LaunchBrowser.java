package com.selenium.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/vitalinashershan/Desktop/selenium/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/"); //launch browser // will not keep history in your browser,comparing to "navigare"
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().to("http:/facebook.com");  //launch browser adv--> we can move back,forward,refresh,will keep history
        driver.navigate().back(); //go to previous page
        Thread.sleep(1000); //1000milliseconds= 1 second; pauses for a second
        driver.navigate().forward(); //go to forward page
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close(); //close current tab
        //driver.quit(); // will quit the whole browser (all the tabs)
    }
}
