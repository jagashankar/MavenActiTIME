package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntraclick 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	List<WebElement> mc=driver.findElements(By.xpath("//a[@data-type='navElements']"));
	System.out.println(mc.size());
      // for ( int i=0 ; i<mc.size() ; i++)
	{
		//if
		
	
	}
	
	}
}
