package pom4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crmlogin {
	
	

	@FindBy (xpath="//input[@name='username']")
	  private	WebElement username;
	
	
	@FindBy(xpath="//input[@name='password']")
	 private WebElement pwd;
	
	
	@FindBy (xpath="//input[@value='Login']")
	   private WebElement login;
	
	
	Crmlogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void logintoCRM(String username1, String password)
	{
		username.sendKeys(username1);
		pwd.sendKeys(password);
		login.click();
		
	}


}
