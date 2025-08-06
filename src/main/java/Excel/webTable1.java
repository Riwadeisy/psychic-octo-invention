package Excel;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webTable1 extends utilFunctions{
	public static void main(String[] args) {
	launch();
	URL("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
    maximize();
    //to find n no of web elements,to get the Table list
    List<WebElement> tables = driver.findElements(By.tagName("table"));
    int size = tables.size();//to get the size of T
    System.out.println("Table Size:"+size); 
    //To get individual table
    WebElement table1=tables.get(1);
    //To get the count of T.Rows
    List<WebElement> tableRows= table1.findElements(By.tagName("tr"));
    int rowsize = tableRows.size();
    System.out.println("Rowsize:"+rowsize);
    //to print all the datas from the table
    for(int i=0;i<rowsize;i++) {
    	System.out.println(tableRows.get(i).getText());
    }
  //to get specific row values
    WebElement tRow1 = tableRows.get(2);
    List<WebElement> tHeaders = tRow1.findElements(By.tagName("th"));
    WebElement tabledata = tHeaders.get(0);
    String place = tabledata.getText();
    System.out.println("Header size:"+place);
    //print headers of each row and column
   for(int i=0;i<rowsize;i++)
    {
    	WebElement eachRow = tableRows.get(i);
    	List<WebElement> eachdatas=eachRow.findElements(By.tagName("th"));
    	int datasize = eachdatas.size();
    	for(int j=0;j< datasize;j++) {
    		WebElement data = eachdatas.get(j);
    		String stroeit = data.getText();
    		System.out.println(stroeit);
    	}}
   //to print specific data
  for(int i=0;i<rowsize;i++)
    {
    	WebElement eachRow = tableRows.get(i);
    	List<WebElement> eachdatas=eachRow.findElements(By.tagName("td"));
    	int datasize = eachdatas.size();
    	for(int j=0;j< datasize;j++) {
    		WebElement data = eachdatas.get(j);
    		String val = data.getText();
    		System.out.println(val);
    	}}
  
 
for(int i =0;i<rowsize;i++) {
	  WebElement eachRow = tableRows.get(i);
  	List<WebElement> eachdatas=eachRow.findElements(By.tagName("td"));
  	int datasize = eachdatas.size();
	for(int j=0;j< datasize;j++) {
		WebElement data = eachdatas.get(j);
		String val = data.getText();
		if (val.equals("Shanghai")) {
    		System.out.println(val);
    		System.out.println("Shanghai row: " + (i + 1));
    		System.out.println("Shanghai column :" +j+1);
              break;
		}
		
	}}}    }
      
    
    
    
    
  
    
    
