package Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {
        File F = new File("C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\sample.xlsx");
        Workbook W = new XSSFWorkbook();  
        Sheet sheet = W.createSheet("Sheet1"); 
        Row r = sheet.createRow(0);      
        Cell C = r.createCell(0);         // First cell in the row
        C.setCellValue("HelloAll");      
        FileOutputStream fileop = new FileOutputStream(F);
        W.write(fileop);                  // Write workbook to file
        System.out.println("Success");
    }
}
