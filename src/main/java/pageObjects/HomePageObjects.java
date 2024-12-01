package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseTest;

public class HomePageObjects extends BaseTest {
    @FindBy(id = "nav_automobile")
    private WebElement link_automobile;

    @FindBy(id = "nav_truck")
    private WebElement link_truck;

    @FindBy(id = "nav_motorcycle")
    private WebElement link_motorcycle;

    @FindBy(id = "nav_camper")
    private WebElement link_capmer;

    public HomePageObjects() {
        PageFactory.initElements(driver,this);
    }

    public void clickOnMotorcycleLink() {
        link_motorcycle.click();
    }
}
