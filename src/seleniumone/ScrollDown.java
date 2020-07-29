package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //driver.get("https://jqueryui.com/droppable/");
		 driver.get("https://www.facebook.com/");
		 /* JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("scroll(0,800)"); //down
		  
          Thread.sleep(3000);
		  
		  JavascriptExecutor js1= (JavascriptExecutor)driver;
		  js.executeScript("scroll(0, -500)"); //up
		  */
		  
		  
		  JavascriptExecutor js3=(JavascriptExecutor )driver;
		  
		           String text = "document.getElementById('u_0_j').value='Swagen123'";
		           
		           js3.executeScript(text);
		  
	}

}
