package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeLoginPage 
{
	//declaration
	
    @FindBy(id="username")
    private WebElement usernametxtfield;
    
    @FindBy(name="pwd")
    private WebElement passwordtextfield;
    
    @FindBy(id="keepLoggedInCheckBox")
    private WebElement keepmeloginchecckbox;
    
    @FindBy(id = "loginButton")    
    private WebElement loginbuttontext;
    
    @FindBy(xpath = "//a[.='Forgot your password?']")
    private WebElement passwordrecoverytlink;
    
    @FindBy(xpath="[href='http://www.actitime.com']")
    private WebElement actitimelink;
    
    //initialiazation
    
    public ActTimeLoginPage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    //utilization
    
    public void loginmethod() throws InterruptedException 
     {
    	usernametxtfield.sendKeys("admin");
    	passwordtextfield.sendKeys("manager");
    	keepmeloginchecckbox.click();
    	loginbuttontext.click();
    	Thread.sleep(3000);
     }
    public void forgotpasswordmethod() 
    	{
    	passwordrecoverytlink.click();
    	}
    	
    	public void actitimelinkmethod()
    	{
    		actitimelink.click();
    	}
    	
    	
     }
    
     

