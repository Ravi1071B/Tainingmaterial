package pom4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {
	
	
	//declare elements in a pom
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//select[@id='day']")
	WebElement day;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement year;
	
	
	@FindBy(xpath="//input[@name='sex'])[2]")
	
	WebElement male;
	
	@FindBy(xpath="//a[contains(text(),'Create a Page')]")
	WebElement create;
	
	
	// intialize elements
	Facebook1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void fname(String fname1)
	{
		firstname.sendKeys(fname1);
	}
	
	
	public void lname(String lname1)
	{
		lastname.sendKeys(lname1);
	}
	
	public void mobilno(String mbnr)
	{
		mobilenumber.sendKeys(mbnr);
	}
	
	public void selectday(int day1)
	{
		Select select = new Select(day);
		
		select.selectByIndex(day1);		
	}
	
	public void selectmonth(String month3)
	{
		Select select = new Select(month);
		select.selectByVisibleText(month3);
		
	}
	
	
	public void selectYesr(String year2)
	{
		Select select = new Select(year);
		select.selectByValue(year2);
		
	}
	
	
	public void clickonmale()
	{
		male.click();
	}
	
	public void createonpage()
	{
		create.click();
	}
	
	
	
	
	
	
	
	
	
	

}
