package test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import generics.AutoConstant;
import pom.ActTimeLoginPage;

public class Actitimelogin implements AutoConstant 
{
	@Test
	public static void actitimelogin() throws InterruptedException, IOException
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty(chrome_key, chrome_value);
		WebDriver driver=new ChromeDriver(option);
		driver.get(url);
		driver.manage().window().maximize();
		ActTimeLoginPage  loginpage=new ActTimeLoginPage(driver);
		loginpage.loginmethod();
	}


}
