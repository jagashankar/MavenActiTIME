package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimehomepage 
{
//declaration
@FindBy(xpath = "//div[@id='container_tasks']")
private WebElement actitimetaskbar;

@FindBy (xpath = "//div[@id='container_reports']")
private WebElement reporticon;

@FindBy (xpath = "//a[@class='content users']")
private WebElement usericon;

	
@FindBy(xpath = "//a[.='Logout']")	
private WebElement actitimelogout;

//initialization 

public Actitimehomepage(WebDriver driver) 
{
  PageFactory.initElements(driver, this);	
}
	
//utilization

public void taskmethod()
   {
	actitimetaskbar.click();
	//reporticon.click();
	//usericon.click();
	
	
	}
public void atlogoutmethod() 
{
	actitimelogout.click();
}
	
}
