package seleniumone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://community.ebay.com/");
	
	      /* List<WebElement> allurls = driver.findElements(By.tagName("a"));
	
	                    int count = allurls.size();
	                       System.out.println(count);*/
	
	
	      /* List<WebElement> allurls = driver.findElements(By.xpath("(//a)[1]"));
	                     int count = allurls.size();
	                     System.out.println(count);
	       */
	                     List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	                     int count = alllinks.size();
	                     System.out.println(count);
	                     
	                     for(int i=0;i<count;i++)
	                     {
	                    	 String text = alllinks.get(i).getText();
	                    	 System.out.println(text);
	                     }
	                     
	       
	       
	}

}
