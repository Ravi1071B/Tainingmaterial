package seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.get("https://login.salesforce.com/");
		driver.get("https://github.com/login");
		
		//driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		/*1 id
		driver.findElement(By.id("firstname")).sendKeys("Swagen");
		driver.findElement(By.id("lastname")).sendKeys("Swagen123");*/
		
		/*2.name
		driver.findElement(By.name("firstname")).sendKeys("Banagalore");
		driver.findElement(By.name("lastname")).sendKeys("Bangalore123");*/
		
		/*3.linlktext
		driver.findElement(By.linkText("Forgot Your Password?")).click();*/
		
		/*4.partilalinktext
		driver.findElement(By.partialLinkText("Forgot Your")).click();
		*/
		
		/*5.cssselector
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Swagen");
		driver.findElement(By.cssSelector("#password")).sendKeys("Swagen001");*/
		
		
		driver.findElement(By.className("label-link")).click();
	}

}
