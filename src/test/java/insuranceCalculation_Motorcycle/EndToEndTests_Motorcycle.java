package insuranceCalculation_Motorcycle;

import com.aventstack.extentreports.Status;
import constants.FrameworkConstants;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.BaseTest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EndToEndTests_Motorcycle extends BaseTest {

    @Test(enabled = false)
    public void errorMessagePayloadField() {
        //Verify error message
        homePageObjects.clickOnMotorcycleLink();
        enterVehicleDataPageObjects.enterCyclinderCapacity("33333");
        String actualErrorMessage = enterVehicleDataPageObjects.getErrorTextOnCyclinderCapacity();
        Assert.assertEquals(actualErrorMessage,"Must be a number between 1 and 2000","Error message doesn't match");
    }
    @Test(enabled = false)
    public void verifyModelDropdownOptions() {
        homePageObjects.clickOnMotorcycleLink();
        List<String> actualValues = enterVehicleDataPageObjects.getDropdownOptions_model();
        test.log(Status.INFO,"Actual dropdown content for model dropdown is :"+actualValues);
        List<String> expectedValues = Arrays.asList("– please select –","Scooter","Three-Wheeler","Moped","Motorcycle");
        test.log(Status.INFO,"Comparing actual value with expecyed");
        Assert.assertEquals(actualValues,expectedValues,"Values do not match in the dropdown ");
    }

    @Test(dataProvider = "sheetData")
    public void insuranceCalculate(HashMap<String,String> testData) throws Exception {
        homePageObjects.clickOnMotorcycleLink();
        System.out.println(testData.toString());
        enterVehicleDataPageObjects.enterVehicleData(testData);
        enterVehicleDataPageObjects.clickNext();

        enterInsuranceDataPageObjects.enterInsuranceData(testData);
        enterInsuranceDataPageObjects.clickNext();

        enterProductDataPageObjects.enterProductData(testData);
        enterProductDataPageObjects.clickNext();
    }

    @DataProvider(name="sheetData")
    public Object[] testDataSupplier(){
        return excelUtility.getDataFromExcel(FrameworkConstants.getExcelFilePath(),"Vehicle_Data");
    }
}
