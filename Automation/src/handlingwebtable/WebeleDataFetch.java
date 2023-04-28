package handlingwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebeleDataFetch {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		List<WebElement> datas=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		for(int i=0;i<datas.size();i++)
		{
			System.out.print(datas.get(i).getText());
			System.out.println();
		}
		
	}

}
