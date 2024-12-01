package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

import java.util.List;

public class EnterInsuranceDataPageObjects extends BaseTest {

    @FindBy(id = "firstname")
    private WebElement txt_firstName;

    @FindBy(id = "lastname")
    private WebElement txt_lastName;

    @FindBy(id = "birthdate")
    private WebElement date_dob;

    @FindBy(xpath = "//input[@name='Gender']/parent::label")
    private List<WebElement> rd_gender;

    @FindBy(id = "streetaddress")
    private WebElement txt_address;

    @FindBy(id = "country")
    private WebElement dd_country;

    @FindBy(id = "zipcode")
    private WebElement txt_zipcode;

    @FindBy(id = "city")
    private WebElement txt_city;

    @FindBy(id = "occupation")
    private WebElement dd_occupation;

    @FindBy(xpath = "//input[@name='Hobbies']/parent::label")
    private List<WebElement> chk_hobbies;

    @FindBy(id = "website")
    private WebElement txt_website;

    @FindBy(id = "picture")
    private WebElement txt_picture;

    @FindBy(id = "open")
    private WebElement btn_open;

    @FindBy(id = "nextenterproductdata")
    private WebElement btn_next;

    @FindBy(id = "preventerproductdata")
    private WebElement btn_prev;


    public EnterInsuranceDataPageObjects() {
        PageFactory.initElements(driver,this);

    }

    public void enterInsuranceData() throws Exception {
        txt_firstName.sendKeys("Test");
        txt_lastName.sendKeys("user");
        date_dob.sendKeys("11/20/1990");
        reusbaleMethods.selectRadioButton(rd_gender,"male");
        txt_address.sendKeys("Test Address");
        reusbaleMethods.selectOptionFromDropdown(dd_country,"India");
        txt_zipcode.sendKeys("570045");
        txt_city.sendKeys("Bangalore");
        reusbaleMethods.selectCheckBoxes(chk_hobbies,"Speeding,Skydiving");
    }

    public void clickNext() {
        btn_next.click();
    }
}
