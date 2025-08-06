package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import java.io.Reader;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class property {
public static void main(String[] args) throws IOException{
	Properties prop = new Properties();
	prop.load(new FileInputStream("C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\src\\main\\java\\Excel\\A.properties"));
	String A = prop.getProperty("Banglore");
	System.out.println(A);
	String B = prop.getProperty("Tutiocorin");
	System.out.println(B);
	
}
}
