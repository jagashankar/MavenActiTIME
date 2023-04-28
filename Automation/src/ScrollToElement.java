import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
      driver.get("https://www.myntra.com/");
      driver.findElement(By.xpath("(//a[.=' Contact Us '])[1]"));
      
      Actions actions= new Actions(driver);
     // actions.scrollToElement
	}

}
