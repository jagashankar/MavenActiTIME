package testngclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pom.ActTimeLoginPage;
import pom.Actitimehomepage;

public class Actitimeloginlogout 
{
@Test
public void loginlogout() throws InterruptedException
{
ChromeOptions option =new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver(option);
driver.get("https://demo.actitime.com");
driver.manage().window().maximize();
ActTimeLoginPage  loginpage=new ActTimeLoginPage(driver);
loginpage.loginmethod();
Thread.sleep(3000);
Actitimehomepage homepage=new Actitimehomepage(driver);
homepage.atlogoutmethod();
}
@Test

}
