package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

    public static void main(String[] args) {
        WebDriver driver;
        String browserName = "";
        if(browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.printf("Browser Name is incorrect");
        }
    }
}
