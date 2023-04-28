package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class ActTimeLoginPage implements AutoConstant
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
    
    public void loginmethod() throws InterruptedException, IOException 
     {
    	usernametxtfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 0));
    	passwordtextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 1));
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
    
     

