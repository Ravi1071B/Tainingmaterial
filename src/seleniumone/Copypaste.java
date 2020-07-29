package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaste {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().deleteAllCookies();

driver.get("https://www.facebook.com/");

   WebElement ele = driver.findElement(By.xpath("//input[@name='firstname']"));

   ele.sendKeys("Swagen123");
   
   Thread.sleep(3000);
   
   ele.sendKeys(Keys.CONTROL+"a");
   Thread.sleep(3000);
   
   ele.sendKeys(Keys.CONTROL+"c");
   
   WebElement ele1 = driver.findElement(By.xpath("//input[@name='lastname']"));

   ele1.clear();
   
   Thread.sleep(3000);

      ele1.sendKeys(Keys.CONTROL+"v");
	}

}
