package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class BaseData
{
public webdriver driver;
 @BeforeSuite
 public void executionstart()
 {
	 System.out.println("execution started");
	 
 }
 @beforemethod
 public void openbrowser() 
 ChromeOptions option =new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://demo.actitime.com");
	driver.manage().window().maximize();
}
