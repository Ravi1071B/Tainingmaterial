package seleniumone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {

System.setProperty("webdriver.ie.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\IEDriverServer.exe");

WebDriver driver = new InternetExplorerDriver();
driver.get("https://www.seleniumhq.org/");
	}

}
