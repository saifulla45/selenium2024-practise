package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Approach 1 by just giving the index number to find the city in the destination
        /*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        Thread.sleep(2000);*/

        //Approach 2 by writing parent child xpath
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        String sourceXpath = "//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']";
        driver.findElement(By.xpath(sourceXpath)).click();
        String destinationXpath = "//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']";
        driver.findElement(By.xpath(destinationXpath)).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
