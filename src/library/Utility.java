package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void capturedscreenshot(WebDriver driver,String screenshotname) throws Exception
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src, new File("./screenshot/"+screenshotname+".png"));
			 System.out.println("Screen shot is taken");
		} catch (Exception e) {
			System.out.println("Exception handles whie taking screenshot" +e.getMessage());
			
		}	
	}

}
