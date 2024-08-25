package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class StaticDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(staticDropdown);
        String firstSelectedOption = select.getFirstSelectedOption().getText();
        System.out.printf(firstSelectedOption);
        Thread.sleep(1000);
        select.selectByIndex(2);
        Thread.sleep(1000);
        select.selectByValue("USD");
        Thread.sleep(1000);
        driver.quit();

    }
}
