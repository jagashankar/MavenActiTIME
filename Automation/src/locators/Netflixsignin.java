package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflixsignin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/Login");
		//driver.findElement(By.id("//input['id_userLoginId']"));
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign up now")).click(); 
		//driver.findElement(By.id("[id='id_userLoginId']")).sendKeys("jagashankar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@data-uia='field-email'])[1]")).sendKeys("sonu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

}
