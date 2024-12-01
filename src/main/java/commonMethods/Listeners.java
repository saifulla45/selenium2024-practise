package commonMethods;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testBase.ObjectsRepo;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Listeners extends ObjectsRepo implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
         test = report.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS,"Test case"+result.getMethod().getMethodName()+"is passed...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL,"Test case "+result.getMethod().getMethodName()+" is failed...");
        test.log(Status.FAIL,result.getThrowable());

        //Add screenshot for failed testcases
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = System.getProperty("user.dir")+"/reports/screenshots/Failed_screenshot_"+currentDate+".jpeg";
        File destination = new File(screenshotPath);
        try {
            FileHandler.copy(src,destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            test.addScreenCaptureFromPath(screenshotPath,"Failed Test Screenshot");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        report=ReportConfig.setupReport();
    }

    @Override
    public void onFinish(ITestContext context) {
        report.flush();
    }
}
