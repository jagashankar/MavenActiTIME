package popuphandle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyupkeydown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement fplink=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(fplink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
	}

}