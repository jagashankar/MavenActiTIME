package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipSugHan 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		//Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone14");
		Thread.sleep(5000);
		//List<WebElement> recomm=driver.findElements(null)
		
	}

}
