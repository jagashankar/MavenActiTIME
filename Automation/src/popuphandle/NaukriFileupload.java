package popuphandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriFileupload {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[.='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		
		
	}

}
