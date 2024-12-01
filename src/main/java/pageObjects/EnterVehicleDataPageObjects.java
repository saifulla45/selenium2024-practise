package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

import java.util.List;

public class EnterVehicleDataPageObjects extends BaseTest {

    @FindBy(id = "make")
    private WebElement dd_make;

    @FindBy(id = "engineperformance")
    private WebElement txt_enginePerformance;

    @FindBy(id = "dateofmanufacture")
    private WebElement date_dateOfManufacture;

    @FindBy(id = "numberofseatsmotorcycle")
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

    @FindBy(id = "cylindercapacity")
    private WebElement txt_CylinderCapacity;

    @FindBy(xpath = "//input[@id='cylindercapacity']/following-sibling::span")
    private WebElement error_CylinderCapacity;

    @FindBy(id = "model")
    private WebElement dd_model;

    public EnterVehicleDataPageObjects() {
        PageFactory.initElements(driver,this);
    }

    public void enterCyclinderCapacity(String capcity) {
        txt_CylinderCapacity.sendKeys(capcity);
    }

    public String getErrorTextOnCyclinderCapacity() {
        return error_CylinderCapacity.getText();
    }

    public List<String> getDropdownOptions_model() {
        return reusbaleMethods.getDropdownOptionsAsList(dd_model);
    }

    public void enterVehicleData() throws Exception {
        reusbaleMethods.selectOptionFromDropdown(dd_make,"BMW");
        reusbaleMethods.selectOptionFromDropdown(dd_model,"Moped");
        txt_CylinderCapacity.sendKeys("333");
        txt_enginePerformance.sendKeys("55");
        date_dateOfManufacture.sendKeys("01/12/2024");
        reusbaleMethods.selectOptionFromDropdown(dd_numberOfSeats,"2");
        txt_listPrice.sendKeys("560");
        txt_annualMileage.sendKeys("110");
    }

    public void clickNext() {
        btn_next.click();
    }
}
