package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticWebTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
        System.out.println(rows.size());
        List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
        System.out.println(columns.size());
        /*
        * ******** PRINT ALL THE VALUES FROM TABLE *******/
        for (int i=2;i<=rows.size();i++) {
            for (int j=1;j<=columns.size();j++) {
                String options = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.print(options+"\t"+"\n");
            }
            System.out.println();
        }
        /*
        * ********** PRINT BOOKS NAME WHOSE AUTHOR IS MUKESH ******** */
        for (int i=2;i<=rows.size();i++) {
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[2]")).getText();
            if(authorName.equals("Mukesh")) {
                String booksName = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[1]")).getText();
                System.out.print("************************");
                System.out.print(booksName);
                System.out.print("************************");
            }
            System.out.println();
        }
        driver.quit();
    }
}
