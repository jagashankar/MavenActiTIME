package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/?");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("tshirt");
		Thread.sleep(3000);
		
		List<WebElement> shirt=driver.findElements(By.xpath("//li[contains(text(),'Tshirt')]"));
		
		for(int i=0;i<shirt.size();i++)
		{
			if(shirt.get(i).getText().equalsIgnoreCase("Tshirts Boys"))
			{
			shirt.get(i).click();
			break;
			}
				
			
		}
		
		
		
	}

}
