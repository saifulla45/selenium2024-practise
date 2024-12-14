package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

import java.util.List;

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

    public void enterProductData() throws Exception {
        date_startDate.sendKeys("04/02/2025");
        reusbaleMethods.selectOptionFromDropdown(dd_insuranceSum,"5.000.000,00");
        reusbaleMethods.selectOptionFromDropdown(dd_damageInsurance,"Full Coverage");
        reusbaleMethods.selectCheckBoxes(chk_optionalProducts,"Euro Protection,Legal Defence Insurance");
    }

    public void clickNext() {
        btn_next.click();
    }
}
