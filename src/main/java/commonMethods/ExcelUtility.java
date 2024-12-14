package commonMethods;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtility {



    public Object[] getDataFromExcel(String filePath,String sheetName) {
        Object[] data;
        Map<String,String> map;
        try {

            File excelFile = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(excelFile);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            int rowNum = sheet.getLastRowNum();
            int columnNum = sheet.getRow(0).getLastCellNum();
            data = new Object[rowNum];
            for(int i=1;i<=rowNum;i++) {
                map = new HashMap<>();
                for(int j=0;j<columnNum;j++) {
                    String key = sheet.getRow(0).getCell(j).getStringCellValue();
                    String value = sheet.getRow(i).getCell(j).getStringCellValue();
                    map.put(key,value);
                    data[rowNum-1] = map;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }


}
