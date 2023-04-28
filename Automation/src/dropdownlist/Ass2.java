
package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Downloads/Arul.html");
		WebElement a=driver.findElement(By.xpath("//select[@name='students']"));
		
		Select select=new Select(a);
		//select.selectByVisibleText("Priyanka");
		//select.selectByIndex(0);
		select.selectByValue("SA");
	}

	
}
