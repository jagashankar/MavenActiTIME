import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropbySlider {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		
		WebElement minPriceRange=driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		Thread.sleep(3000);
          Actions action= new Actions(driver);
          action.dragAndDropBy(minPriceRange, 100, 0).perform();     
          }

}
