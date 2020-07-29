package seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext123 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		/*String text = driver.findElement(By.xpath("//a[contains(text(),'Try for Free')]")).getText();
		System.out.println(text);
		*/
	         WebElement ele = driver.findElement(By.xpath("//input[@id='Login']"));
		                            String text = ele.getAttribute("value");
                          System.out.println(text);
	}

}
