package commonMethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;
import testBase.ObjectsRepo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportConfig extends ObjectsRepo {

    public static ExtentReports setupReport() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        String reportPath = System.getProperty("user.dir")+"/reports/TestReport_"+currentDate+".html";

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

        report = new ExtentReports();
        report.attachReporter(spark);

        spark.config().setDocumentTitle("Automation Test Execution Report");
        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("Test Execution Report");
        spark.config().setTimeStampFormat("DD-MMM-YYYY HH:mm:ss");
        spark.config().setProtocol(Protocol.HTTPS);

        return report;
    }
}
