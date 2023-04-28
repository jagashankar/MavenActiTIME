package webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSugHan
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("tommy");
		Thread.sleep(5000);
	    List<WebElement> recom=driver.findElements(By.xpath("//li[contains(text(),'Tommy Hilfiger')]"));
	   
	    for(int i = 0; i<recom.size();i++)
	    {
	    	if (recom.get(i).getText().equalsIgnoreCase("Tommy Hilfiger Bags"))       
	    			{
			         	recom.get(i).click();
			         	break;
			        }
	    }
			
		}
		    
	

}
