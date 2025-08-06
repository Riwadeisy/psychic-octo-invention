package Excel;
import java.io.File;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
public class classExcel {
    public static void main(String[] args) throws IOException { 
        File F = new File("C:\\Users\\sanku\\Documents\\Book1.xlsx");
        FileInputStream stream = new FileInputStream(F);
         Workbook W = new XSSFWorkbook(stream);
         Sheet S = W.getSheet("Sheet1");
        //Row r = S.getRow(1);
       // Cell c = r.getCell(2);
       // System.out.println(c);
       
        int numberofrows = S.getPhysicalNumberOfRows();
        System.out.println("Rows----"+numberofrows);
        Row r1= S.getRow(0);
       for(int i=0;i<numberofrows;i++) {
        	Row A=S.getRow(i);
        	System.out.println(1);
        int numberofcolumn = r1.getPhysicalNumberOfCells();
        System.out.println("Columns----"+numberofcolumn);
       for(int j=0;j<numberofcolumn;j++) {
        	Cell c1 = A.getCell(j);
        	System.out.println(c1);
     int celltype = c1.getCellType();
     System.out.println("Cell type"+celltype);
     if(celltype==1) {
    	 String stringval = c1.getStringCellValue();
    	 System.out.println("String value"+stringval);
     }else if(celltype==0)
     {
    	 if(DateUtil.isCellDateFormatted(c1)){
 			Date d = c1.getDateCellValue();
 			SimpleDateFormat SD =new SimpleDateFormat("mm-dd-yy");
 			String datevalue = SD.format(d);
 			System.out.println(datevalue);
 			
    	 }}
     }}}}