package pom4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
	WebDriver driver;
	
	@Test
	public void facebooktest2() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		 
		  driver.get("https://www.facebook.com/");
		  
		  Facebook1 face=new  Facebook1(driver);
		  
		  face.fname("Swagen");
		  
		  Thread.sleep(2000);
		  
		  face.lname("bangalore");
		  Thread.sleep(2000);
		  
		  face.mobilno("2355666");
		  Thread.sleep(2000);
		  
		  face.selectday(28);
		  
		  Thread.sleep(2000);
		  face.selectmonth("3");
		  Thread.sleep(2000);
		  face.selectYesr("2016");
		  Thread.sleep(2000);
		  face.clickonmale();
		  Thread.sleep(2000);
		  face.createonpage();
		  driver.navigate().back();
		  
		  
		
	}

}
