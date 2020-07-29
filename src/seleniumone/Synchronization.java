package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().deleteAllCookies();

driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Swagen123");

//Thread.sleep(2000);

driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Swagen123");





	}

}
