package seleniumone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.spicejet.com/");
		  //driver.get("https://www.seleniumhq.org/");
		  
		 /* 1.attribute
		  driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Bangalore");
               
		  driver.findElement(By.xpath("//input[@id='q'][@name='q']")).sendKeys("Karnataka");
		  
		  driver.findElement(By.xpath("//input[@id='q' or @name='q']")).sendKeys("Swagen");*/
		  
		  /*2.Text
		  driver.findElement(By.xpath("//a[text()='Download']")).click();*/
		  
		 /* 3.contains
		  driver.findElement(By.xpath("//input[contains(@value,'Sign in')]")).click();*/
		  
		  //driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
		  
		 /*4 Group
		  driver.findElement(By.xpath("(//a)[5]")).click();*/
		  
		  driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/../..//select/option[3]")).click();
	}

}
