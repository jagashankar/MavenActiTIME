package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerpage 
{
//declaration 
	//@FindBy(xpath = "//a[@class='content selected tasks']")
	//private WebElement taskbaricon;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewbotton;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
    private WebElement createnewcustomer;
	
	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement eneterCustomeenametxtfield;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomerbutton;
	
	//Initialization
	
	public CreateCustomerpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void createcustomermethod()
	{
		addnewbotton.click();
		createnewcustomer.click();
		 eneterCustomeenametxtfield.sendKeys("jsd");
		 createcustomerbutton.click();
		
		
	}
	
	
	
	
}
