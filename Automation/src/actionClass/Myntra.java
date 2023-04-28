package actionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.myntra.com/?");
		
		 WebElement men=dri.findElement(By.xpath("//a[.='Men']"));
		 WebElement d=dri.findElement(By.xpath("//a[.='Sweatshirts']"));
		 
		 Actions act=new Actions(dri);
		 act.moveToElement(men).perform();
		 Thread.sleep(3000);
		 d.click();
		 		
		 
		
	}

}
