package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoCRM1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ravi12345");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ravi@12345");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
		
		
		
		
	}

}
