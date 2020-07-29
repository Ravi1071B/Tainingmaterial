package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragnddrop5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  
		  driver.manage().deleteAllCookies();
		  
String url = "http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html";

           driver.get(url);
           
           WebElement source1 = driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
           WebElement target1 = driver.findElement(By.xpath("//h1[contains(text(),'Block 3')]"));
           
           Actions action = new Actions(driver);
           action.dragAndDrop(source1, target1).build().perform();
	}

}
