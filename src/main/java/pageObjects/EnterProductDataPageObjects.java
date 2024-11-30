package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EnterProductDataPageObjects {
    public EnterProductDataPageObjects(WebDriver driver) {
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

    @FindBy(id = "nextenterinsurancedata")
    private WebElement btn_next;
}
