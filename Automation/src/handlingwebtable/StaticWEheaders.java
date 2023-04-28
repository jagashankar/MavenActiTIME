package handlingwebtable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWEheaders {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> headers=driver.findElements(By.xpath("//table[@id='table1']//thead//th"));
		for(int i=0;i<headers.size();i++)
			{
				System.out.println("headers of the webtable is :" +headers.get(i).getText());
			}
		
	}

}
