package seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogintoCRM {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ravi12345");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ravi@12345");
		
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		WebDriverWait wait= new WebDriverWait(driver,10);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='topnavlink'])[3]")));
		  
		String title = driver.getTitle();
		System.out.println(title);
		  
	}

}
