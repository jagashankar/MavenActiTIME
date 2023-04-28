package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterReturn {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		
		WebElement password=driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		password.sendKeys("manager");
		Thread.sleep(2000);
		password.sendKeys(Keys.ENTER);
	}

}
