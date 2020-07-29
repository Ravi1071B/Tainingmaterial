package pom4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Face234Test {
	
	WebDriver driver;
	@Test
	public void facebook234() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\RaviEclipseWorkspace\\Projectwork\\Batch3\\lib\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().deleteAllCookies();
		    
		    
		    
		    driver.get("https://www.facebook.com/");
		    
		    Face234 f=new Face234(driver);
		    f.selectdata2(25);
		    Thread.sleep(3000);
		    
		    f.selectmonth1("10");
		    Thread.sleep(3000);
		    f.selectyear1("2000");
		    
		
	}

}
