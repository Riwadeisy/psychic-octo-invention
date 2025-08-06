package Excel;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webTabledynamic extends utilFunctions {
	static int rowposition=0;
	static int columnposition=0;
	public static void main(String[]args) {
		launch();
		URL("https://demo.guru99.com/test/web-table-element.php");
		maximize();
		List<WebElement> header = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		int headersize = header.size();
		System.out.println("HEADER SIZE:::"+headersize);
		
		List<WebElement> Rowsize = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		int rowsize = Rowsize.size();
		System.out.println("ROW SIZE:::"+rowsize);	
		
		 for(int i=1;i <rowsize;i++) {
	  for(int j=1;j<headersize;j++) {
WebElement allRowValues = driver.findElement( By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[" + j + "]"));
 String value =allRowValues .getText();
	   System.out.println(value);
	}}
	  for(int i=1;i<rowsize;i++){
	  for(int j=1;j<headersize;j++) {
	  WebElement Allrowvalues=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
	  String value = Allrowvalues.getText();
	  if(value.contains("Mangalore")) {
	  System.out.println(value);	
	  System.out.println("ROW"+i);	
	  rowposition=i;
	  System.out.println("COLUMN"+j);	
      columnposition=j;
	  }	
	}
	}
	  System.out.println("<<<<<<<<<<");
	  System.out.println("ITERATING ROW VALUES:");
	  
	/*for(int i=1;i<rowsize;i++)
	{
      WebElement Allrowvalues = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+columnposition+"]"));
	  String valueA = Allrowvalues.getText();
	  System.out.println(valueA);
	}
	System.out.println("<<<<<<<<<<");
	System.out.println("ITERATION OF COLUMN VALUES");	
	  for(int i=1;i <=headersize;i++){
     WebElement Allrowvalues=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+rowposition+"]//td["+i+"]"));
     String valueA =Allrowvalues.getText();
     System.out.println(valueA);
	  }*/
        WebElement company=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Company']"));
        WebElement group=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Group']"));
        WebElement prevclose = driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[contains(text(),'Prev Close')]"));

        WebElement currentprice=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Current Price (Rs)']"));
        WebElement chan=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='% Change']"));

    int companyIndex =header.indexOf(company) + 1;
	int groupIndex = header.indexOf(group) + 1;
	int prevcloseIndex =header.indexOf(prevclose) + 1;
	int currentpriceIndex =header.indexOf( currentprice) + 1;
	int chanIndex = header.indexOf(chan)+ 1;

	// To print values in the 'change' column
	for (int i = 1; i < rowsize; i++) {
	    WebElement allRowValues = driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[" + chanIndex + "]"));
	    String value = allRowValues.getText();
	    System.out.println(value);
	}

	// To print values in the 'company' column
	for (int j= 1; j < rowsize; j++) {
	    WebElement allRowValues = driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + j + "]//td[" + companyIndex + "]"));
	    String value = allRowValues.getText();
	    System.out.println(value);
	}}}