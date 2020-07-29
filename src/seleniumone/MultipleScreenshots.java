package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utility;

public class MultipleScreenshots {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.facebook.com/");
		  Utility.capturedscreenshot(driver, "browseropen");
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Swagen123@gmail.com");
		   Utility.capturedscreenshot(driver, "TypeUsername");
		   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Swagen12");
		   Utility.capturedscreenshot(driver, "Typepwd");
		   
		   
	}

}
