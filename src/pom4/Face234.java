package pom4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Face234 {
	
	
	@FindBy(xpath="//select[@id='day']")
	WebElement day;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement year;
	
	
	Face234(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectdata2(int day2)
	{
		Select select1= new Select(day);
		select1.selectByIndex(day2);
		
	}
	
	public void selectmonth1(String month1)
	{
		Select select1= new Select(month);
		select1.selectByValue(month1);
		
	}
	
	public void selectyear1(String year1)
	{
		Select select1= new Select(year);
		select1.selectByVisibleText(year1);
		
	}

}
