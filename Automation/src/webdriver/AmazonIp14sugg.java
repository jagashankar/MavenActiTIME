package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIp14sugg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
		Thread.sleep(3000);
		List<WebElement> sugg =driver.findElements(By.xpath("//div[@role='button']"));
			 
		for(int i=0;i<sugg.size();i++)
		{
			if (sugg.get(i).getText().equalsIgnoreCase("oneplus9"));
		
			{
				sugg.get(i).click();
				break;
			}
		}
		
		
	}

}
