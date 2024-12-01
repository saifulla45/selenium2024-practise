package testBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.ReusbaleMethods;
import org.openqa.selenium.WebDriver;
import pageObjects.EnterInsuranceDataPageObjects;
import pageObjects.EnterProductDataPageObjects;
import pageObjects.EnterVehicleDataPageObjects;
import pageObjects.HomePageObjects;

public class ObjectsRepo {

    public static WebDriver driver;
    public static ExtentReports report;
    public static ExtentTest test;
    public static HomePageObjects homePageObjects;
    public static EnterVehicleDataPageObjects enterVehicleDataPageObjects;
    public static EnterInsuranceDataPageObjects enterInsuranceDataPageObjects;
    public static EnterProductDataPageObjects enterProductDataPageObjects;
    public ReusbaleMethods reusbaleMethods = new ReusbaleMethods();
}
