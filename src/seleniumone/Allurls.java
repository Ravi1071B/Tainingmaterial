package seleniumone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allurls {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		
		 List<WebElement>  allurls=driver.findElements(By.xpath("//a"));
		  int count = allurls.size();
		  System.out.println("Totall no of Urls in a page is:" +count);
		  
		  for(int i=0;i<count;i++)
		  {
			   String url=allurls.get(i).getAttribute("href");
			   System.out.println(url);
		  }

	}

}
