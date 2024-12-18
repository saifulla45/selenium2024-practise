package constants;

public class FrameworkConstants {
    private FrameworkConstants(){}

    private static String excelFilePath = System.getProperty("user.dir")+"/src/test/resources/testData/customerData.xlsx";

    public static String getExcelFilePath() {
        return excelFilePath;
    }
}
