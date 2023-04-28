package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebbookNameChange {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("qspider");
		username.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		username.sendKeys("jspider");
	}

}
