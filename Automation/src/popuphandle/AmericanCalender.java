package popuphandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanCalender {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?");
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		List<WebElement>firstmonthyear=driver.findElements(By.xpath(("(//div[@class='ui-datepicker-title'])[1]")));
		List<WebElement>secondmonthyear=driver.findElements(By.xpath(("(//div[@class='ui-datepicker-title'])[2]")));
		String month="",month1="",year1="",month4="",year5="",month5="";
		for(int i =0;i < firstmonthyear.size();i++) 
		{
			Thread.sleep(2000);
			 month =firstmonthyear.get(i).getText();
		     month1=month.split(" ")[0];
			 year1=month.split(" ")[1];
		}
			for(int i=0;i<secondmonthyear.size();i++)
			{
				Thread.sleep(2000);
				 month4 =secondmonthyear.get(i).getText();
				 month5=month4.split(" ")[0];
				 year5=month4.split(" ")[1];
			}
			while (!(month1.equals("March")&&month5.equals("April")&&year1.equals("2023")&&year5.equals("2023")))
					{
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
				Thread.sleep(2000);
		String m=driver.findElement(By.xpath(("(//div[@class='ui-datepicker-title'])[1]"))).getText();
		Thread.sleep(2000);
		String n=driver.findElement(By.xpath(("(//div[@class='ui-datepicker-title'])[2]"))).getText();
			month1=m.split(" ")[0];	
			 year1     =m.split(" ")[1];
			 month5=n.split(" ")[0];
			 year5=n.split(" ")[1];
			}
			driver.findElement(By.xpath("(//td[@data-handler='selectDay'])[24]")).click();
	}
}
			
			
			
			
			
			
		
	


