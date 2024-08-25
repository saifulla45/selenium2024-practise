package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement autosuggestiveTxtbox = driver.findElement(By.id("autosuggest"));
        autosuggestiveTxtbox.sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> countryNames = driver.findElements(By.cssSelector(".ui-menu-item a"));
        for(WebElement countryName:countryNames) {
            if(countryName.getText().equals("India")) {
                countryName.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
