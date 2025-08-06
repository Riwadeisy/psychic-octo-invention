package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUpdate {
	 public static void main(String[] args) throws IOException { 
		 File f = new File("C:\\Users\\sanku\\Downloads\\Book2.xlsx");
		 FileInputStream stream = new FileInputStream(f);
         Workbook W = new XSSFWorkbook(stream);
         Sheet S = W.getSheet("Sheet1");
         Row r = S.getRow(0);
         Cell c = r.getCell(0);
         //System.out.println(c);
         String ActualValue=c.getStringCellValue();
         if(ActualValue.equals("Bradpitt")) {
        	 c.setCellValue("jhonnydepp");
         }
         FileOutputStream Fileoutput= new FileOutputStream(f);
         W.write(Fileoutput);
         System.out.println("Successfully Updated");   
	 }
}
