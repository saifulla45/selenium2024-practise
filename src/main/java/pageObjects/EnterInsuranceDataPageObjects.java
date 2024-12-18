package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

import java.util.List;
import java.util.Map;

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

    public void enterInsuranceData(Map<String,String> testData) throws Exception {
        txt_firstName.sendKeys(testData.get("First_Name"));
        txt_lastName.sendKeys(testData.get("Last_Name"));
        date_dob.sendKeys(testData.get("Date_Of_Birth"));
        reusbaleMethods.selectRadioButton(rd_gender, testData.get("Gender"));
        txt_address.sendKeys(testData.get("Street_Address"));
        reusbaleMethods.selectOptionFromDropdown(dd_country, testData.get("Country"));
        txt_zipcode.sendKeys(testData.get("Zip_Code"));
        txt_city.sendKeys(testData.get("City"));
        reusbaleMethods.selectCheckBoxes(chk_hobbies, testData.get("OccupationHobbies"));
    }

    public void clickNext() {
        btn_next.click();
    }
}
