package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class kkkkk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().deleteAllCookies();
      
      driver.get("https://www.spicejet.com/");
      
         WebElement ele = driver.findElement(By.xpath("(//a[@id='highlight-addons'])[2]"));
         
         Actions action = new Actions(driver);
         
         action.moveToElement(ele).build().perform();
         
	}

}
