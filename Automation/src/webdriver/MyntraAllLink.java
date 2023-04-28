package webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAllLink {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		List<WebElement> link=driver.findElements(By.xpath("//a"));
	System.out.println(link.size());
	for(int i =0;i<link.size();i++)
	{
		
	//System.out.println(link.get(i).getAttribute("href"));	
	//System.out.println(link.get(i).getText());
	}

}
}