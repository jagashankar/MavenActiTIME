package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pom.ActTimeLoginPage;
import pom.Actitimehomepage;

public class ActitimeTest {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		ActTimeLoginPage  loginpage=new ActTimeLoginPage(driver);
		loginpage.loginmethod();
		 Actitimehomepage homepage= new Actitimehomepage(driver);
		 homepage.loginmethod();
		 

	}

}
