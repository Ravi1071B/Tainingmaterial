package seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEXP {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		  WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		  
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		   WebElement forgotacc = driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));
		   
		sendkeys(driver, firstname, 10, "Ravi123");
		
		sendkeys(driver, lastname, 5, "Swagen");
		
		clickon(driver, forgotacc, 3);
	}
	
	
public static void sendkeys(WebDriver driver, WebElement element, int timeouts, String value) {
	
	
	WebDriverWait wait= new WebDriverWait(driver,timeouts);
	wait.until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
}

public static void clickon(WebDriver driver,WebElement element, int timeouts) {
	
	WebDriverWait wait=new WebDriverWait(driver,timeouts);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	element.click();
	
}
	

}

