package actionClass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ContextMenu {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement forgotlink=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions action =new Actions(driver);
		action.contextClick(forgotlink).perform();
		
		Robot robo=new Robot();
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		 robo.keyPress(KeyEvent.VK_ENTER);
		 
		 robo.keyRelease(KeyEvent.VK_DOWN);
		 robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
