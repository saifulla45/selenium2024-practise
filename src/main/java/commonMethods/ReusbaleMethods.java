package commonMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ReusbaleMethods {

    public void selectOptionFromDropdown(WebElement element,String name) throws Exception {
        Select select = new Select(element);
        try {
            select.selectByVisibleText(name);
        } catch (Exception e) {
            throw new Exception("Value is not present in the dropdown for webelement :"+element+" value to be selected is : "+name);
        }
    }

    public List<String> getDropdownOptionsAsList(WebElement element) {
        Select select = new Select(element);
        List<WebElement>allOptions=select.getOptions();
        List<String> optionNames = new ArrayList<>();
        for(WebElement option:allOptions) {
            optionNames.add(option.getText());
        }
        return optionNames;
    }

    public void selectRadioButton(List<WebElement> elements,String valueToBeSelected) {
        for(WebElement element:elements) {
            if(element.getText().equalsIgnoreCase(valueToBeSelected)) {
                element.click();
                break;
            }
        }
    }

    public void selectCheckBoxes(List<WebElement> elements,String checkOptions) {
        String [] options = checkOptions.split(",");
        for(String option:options) {
            for(WebElement element:elements) {
                if(element.getText().equalsIgnoreCase(option)) {
                    element.click();
                    break;
                }
            }
        }
    }
}
