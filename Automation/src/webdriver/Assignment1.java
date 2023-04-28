package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		List<WebElement>menu=driver.findElements(By.xpath("//a[@class='desktop-main']"));
		System.out.println(menu.size());
		
		for(int i=0;i<menu.size();i++)
		{
			if(menu.get(i).getText().equalsIgnoreCase("studio"))
				menu.get(i).click();
			break;
		}
	}

}
