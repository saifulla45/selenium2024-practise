package insuranceCalculation_Motorcycle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import testBase.BaseTest;

import java.time.Duration;

public class EndToEndTests_Motorcycle extends BaseTest {
    @Test
    public void insuranceCalculate_VolvoMotor() {
        System.out.println(driver.getTitle());
    }

    @Test
    public void insuranceCalculate_BmwMotor() {
        System.out.println(driver.getCurrentUrl());
    }
}
