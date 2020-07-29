package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	
	
	public void gettitle(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");
             driver= new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\geckodriver.exe");

			
			WebDriver driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\IEDriverServer.exe");

			WebDriver driver = new InternetExplorerDriver();
			
		}
		
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	

}
