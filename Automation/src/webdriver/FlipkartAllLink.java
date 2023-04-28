package webdriver;

	
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAllLink {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		for(int i=0 ; i<alllinks.size();i++)
		{
		System.out.println(alllinks.get(i).getText());
		System.out.println(alllinks.get(i).getAttribute("href"));
		}
		
	}

}
