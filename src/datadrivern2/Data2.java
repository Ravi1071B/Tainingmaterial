package datadrivern2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Xls_Reader;

public class Data2 {

	public static void main(String[] args) {


		 System.setProperty("webdriver.chrome.driver", "E:/SeleniumSoftware/Chrome/chromedriver.exe");
		    
	     WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://reg.ebay.in/reg/PartialReg?_trksid=m37&rv4=1");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    Xls_Reader reader = new Xls_Reader("E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\src\\testdatasheet\\Pracrice1.xlsx");
	    
	    
	          int rowcount = reader.getRowCount("Data");
	          System.out.println(rowcount);
	          
	          reader.addColumn("Data", "status");
	          
	          
	          for(int rownum=2; rownum<=rowcount; rownum++)
	        	  
	          {
	        	         String firstname1 = reader.getCellData("Data", "firstname", rownum);
	        	         System.out.println(firstname1);
	        	         
	        	         String lastname1 = reader.getCellData("Data", "lastname", rownum);
          			   System.out.println(lastname1);
          			   
          			   
          			   String emailaddress1 = reader.getCellData("Data", "emailaddress", rownum);
          			   System.out.println(emailaddress1);
          			   
          			   String password1 = reader.getCellData("Data", "password", rownum);
          			   System.out.println(password1);
          			   
          			   
          			   
          			 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname1);
          			
          			//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname1);
          			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname1);
          			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailaddress1);
          			
          			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password1);
          			
          			
          			reader.setCellData("Data", "status", 2, "pass");
          			reader.setCellData("Data", "status", 3, "pass");
          			reader.setCellData("Data", "status", 4, "fail");
          			
	        	  
	        	  
	        	      
	          }

	}

}
