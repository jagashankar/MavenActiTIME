package popuphandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickwithoutArguement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//WebElement link=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		WebElement nextlink=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		
		action.moveToElement(nextlink).click().perform();
		
	}

}
