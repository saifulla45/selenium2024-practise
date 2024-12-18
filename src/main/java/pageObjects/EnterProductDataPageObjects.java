package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

import java.util.List;
import java.util.Map;

public class EnterProductDataPageObjects extends BaseTest {
    public EnterProductDataPageObjects() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "startdate")
    private WebElement date_startDate;

    @FindBy(id = "insurancesum")
    private WebElement dd_insuranceSum;

    @FindBy(id = "meritrating")
    private WebElement dd_meritRating;

    @FindBy(id = "damageinsurance")
    private WebElement dd_damageInsurance;

    @FindBy(xpath = "//input[@name='Optional Products[]']/parent::label")
    private List<WebElement> chk_optionalProducts;

    @FindBy(id = "courtesycar")
    private WebElement dd_courtseyCar;

    @FindBy(id = "preventerinsurancedata")
    private WebElement btn_prev;

    @FindBy(id = "nextselectpriceoption")
    private WebElement btn_next;

    public void enterProductData(Map<String,String> testData) throws Exception {
        date_startDate.sendKeys(testData.get("Start_Data"));
        reusbaleMethods.selectOptionFromDropdown(dd_insuranceSum, testData.get("Insurance_Sum"));
        reusbaleMethods.selectOptionFromDropdown(dd_damageInsurance, testData.get("Damage_Insurance"));
        reusbaleMethods.selectCheckBoxes(chk_optionalProducts, testData.get("Optional_Products"));
    }

    public void clickNext() {
        btn_next.click();
    }
}
