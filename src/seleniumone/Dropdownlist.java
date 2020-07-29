package seleniumone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");


WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();

driver.get("https://www.facebook.com/");


WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));

Select select = new Select(month);

select.selectByIndex(5);

Thread.sleep(5000);
select.selectByValue("10");

Thread.sleep(5000);
select.selectByVisibleText("Dec");





		
		
		
	}

}
