package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://jqueryui.com/droppable/");
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  js.executeScript("scroll(0,300)");
		  
		  driver.switchTo().frame(0);
		  
		  WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		  WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		  
		  Actions action= new Actions(driver);
		  action.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
	}

}
