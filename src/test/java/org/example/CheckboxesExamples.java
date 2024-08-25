package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckboxesExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("input[id *='friendsandfamily']")).click();
        List<WebElement> noOfCheckboxes = driver.findElements(By.xpath("//div[@id = 'discount-checkbox']/div//input"));
        System.out.println("There are "+noOfCheckboxes.size()+" checkboxes in the page");
        noOfCheckboxes.get(3).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
