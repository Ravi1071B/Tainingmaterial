package seleniumone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncount1 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");


WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().deleteAllCookies();


driver.get("https://www.facebook.com/");

WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));

Select select=new Select(month);
 List<WebElement> month2 = select.getOptions();
       int count = month2.size();
       
       System.out.println("Totall options available in a month is:" + count);
		
       for(int i=0; i<count;i++)
       {
    	   String text = month2.get(i).getText();
    	   System.out.println(text);
    	        
       }

	}

}
