package dropdownlist;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ocurrance1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Downloads/Arul.html");
		
		WebElement ele=driver.findElement(By.xpath("//select[@name='students']"));
		
		Select select=new Select(ele);
		
		List<WebElement> list=select.getOptions();
		
		HashMap<String, Integer> has=new HashMap<>();
		
		for(int i=0;i<list.size();i++)
		{
			String s=list.get(i).getText();
			if(has.containsKey(s))
			{
				has.put(s, has.get(s));
			}
			
			
			else
			{
				has.put(s, 1);
			}
		}
		System.out.println("occurance of debasish is  " + has.get("Debasish"));
	}

}
