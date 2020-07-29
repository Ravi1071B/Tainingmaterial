package datadrivern2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Xls_Reader;

public class DataDrivenTest1 {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\src\\testdatasheet\\Testdata.xlsx");

	 String firstname = reader.getCellData("Data", "firstname", 2);
	 System.out.println(firstname);
	 
	 String lastname = reader.getCellData("Data", "lastname", 2);
	 System.out.println(lastname);
		
	 String emailaddress = reader.getCellData("Data", "emailaddress", 2);
	 System.out.println(emailaddress);
	 
	 String password = reader.getCellData("Data", "password", 2);
	 System.out.println(password);
	 
	 
	 // webdriver
	 
	 System.setProperty("webdriver.chrome.driver", "E:/SeleniumSoftware/Chrome/chromedriver.exe");
	    
     WebDriver driver = new ChromeDriver();
    
    driver.get("https://reg.ebay.in/reg/PartialReg?_trksid=m37&rv4=1");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    
    
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailaddress);
    driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password);
	 
	 
		
		
	}

}
