package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		//Thread.sleep(1000);//
		driver.findElement(By.id("email")).sendKeys("rajesh");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mamuni");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

	}

}

