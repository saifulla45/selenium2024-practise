package testBase;

import commonMethods.PropertiesConfig;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.EnterInsuranceDataPageObjects;
import pageObjects.EnterProductDataPageObjects;
import pageObjects.EnterVehicleDataPageObjects;
import pageObjects.HomePageObjects;

import java.time.Duration;

public class BaseTest extends ObjectsRepo{

    public void launchBrowserAndNavigate() {
        String browserName = PropertiesConfig.getPropertyValue("browser");

        switch (browserName){
            case "chrome" :
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                options.addArguments("--ignore-certificate-error");
                options.addArguments("disable-popup-blocking");
                driver = new ChromeDriver(options);
                break;
            case "firefox" :
                String currentDir = System.getProperty("user.dir");
                System.out.println(currentDir);
                FirefoxOptions options1 = new FirefoxOptions();
                options1.addArguments("-private");
                driver = new FirefoxDriver(options1);
                break;
            default:
                System.out.println("Please assign a driver to it");


        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(PropertiesConfig.getPropertyValue("url"));

    }
    @BeforeMethod
    public void setUp() {
        launchBrowserAndNavigate();
        homePageObjects = new HomePageObjects();
        enterVehicleDataPageObjects = new EnterVehicleDataPageObjects();
        enterInsuranceDataPageObjects = new EnterInsuranceDataPageObjects();
        enterProductDataPageObjects = new EnterProductDataPageObjects();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
