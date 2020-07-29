package seleniumone;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot123 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.facebook.com/");
		  
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Swagen123@gmail.com");
		   
		   
		   TakesScreenshot ts=(TakesScreenshot)driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
		     FileUtils.copyFile(src, new File("./screenshot/facebook.png"));
		     System.out.println("Screen shot is taken");	
	}

}
