package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XndYCTextbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
                       
		         Point p = email.getLocation();
		         
		         System.out.println(p.getX());
		         System.out.println(p.getY());
		         

	}

}
