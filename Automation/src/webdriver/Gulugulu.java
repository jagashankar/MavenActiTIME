package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gulugulu {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .navigate().to("https://www.google.com");
		Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
		driver.navigate().forward();

	}

}
