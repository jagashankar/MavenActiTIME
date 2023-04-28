package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartmouseHover {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
	    WebElement fashion=driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"));
	    Thread.sleep(2000);
	    WebElement footwear =driver.findElement(By.xpath("(//a[@class='_6WOcW9 _2-k99T'])[1]"));
	    WebElement sports=driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]"));
	    
	   Actions act= new Actions(driver);
	   act.moveToElement(fashion).perform();
	   Thread.sleep(4000);
	   act.moveToElement(footwear).perform(); 
	   act.click(sports).perform();
	}
	

}
