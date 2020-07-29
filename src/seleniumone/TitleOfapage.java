package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfapage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumhq.org/");
		
		       /* String title = driver.getTitle();
		        System.out.println("Title of a page is :" + title);*/
		
		
		String url = driver.getCurrentUrl();
		System.out.println("URL of a current page is:" +url);
	}
	

}
