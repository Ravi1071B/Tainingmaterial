package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropndown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bangalore");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Swagen");
		 Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567889");
          Thread.sleep(3000);
           
          
          Select select = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		    select.selectByIndex(25);
		    Thread.sleep(3000);
		   
		    Select select1= new Select(driver.findElement(By.xpath("//*[@id='month']")));
		    select1.selectByValue("6");
		    Thread.sleep(3000);
		   
		    Select select2 = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		    select2.selectByVisibleText("1993");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();
		    Thread.sleep(3000);
		    
		    driver.navigate().back();
		    
	}

}
