package seleniumone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationsteps {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "E:\\RaviEclipseWorkspace\\Projectwork\\Batch4\\lib\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.seleniumhq.org/");

Thread.sleep(3000);

driver.navigate().to("https://www.amazon.in/");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();

	}

}
