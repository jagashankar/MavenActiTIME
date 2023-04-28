package generics;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTestclass  implements AutoConstant
{
public WebDriver driver;
	
	@BeforeSuite
	public void executionStart()
	{
		System.out.println("execution started");
	}
	
	@BeforeClass
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
	@AfterSuite
	public void executionComplete()
	{
		System.out.println("execution completed");
	}
}
