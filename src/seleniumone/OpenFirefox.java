package seleniumone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\geckodriver.exe");

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/");
	}

}
