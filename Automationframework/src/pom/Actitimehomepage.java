package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimehomepage 
{
//declaration
	@FindBy(xpath = "//a[@class='content selected tt']")
	private WebElement actitimetaskbar;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement actitimelogout;
	
	//initialization
	
	public Actitimehomepage(WebDriver driver)
	
	
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void loginmethod()
	
	{
		actitimetaskbar.click();
		
	}
	
	public void logoutmethod() 
	{
	   actitimelogout.click();	
	}
}


