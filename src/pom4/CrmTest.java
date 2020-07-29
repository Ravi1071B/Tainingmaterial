package pom4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.freecrm.com/index.html");

		  
		  Crmlogin c= new Crmlogin(driver);
		  
		  c.logintoCRM("Ravi12345", "Ravi@12345");
		  
		  
	}

}
