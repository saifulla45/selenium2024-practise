package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterVehicleDataPageObjects {

    @FindBy(id = "make")
    private WebElement dd_make;

    @FindBy(id = "engineperformance")
    private WebElement txt_enginePerformance;

    @FindBy(id = "dateofmanufacture")
    private WebElement date_dateOfManufacture;

    @FindBy(id = "numberofseats")
    private WebElement dd_numberOfSeats;

    @FindBy(id = "fuel")
    private WebElement dd_fuelType;

    @FindBy(id = "listprice")
    private WebElement txt_listPrice;

    @FindBy(name = "License Plate Number")
    private WebElement txt_licenseNumberPlate;

    @FindBy(id = "annualmileage")
    private WebElement txt_annualMileage;

    @FindBy(id = "nextenterinsurantdata")
    private WebElement btn_next;

    public EnterVehicleDataPageObjects(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
