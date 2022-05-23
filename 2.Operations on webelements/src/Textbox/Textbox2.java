
//2. How to get a Text Box value using Selenium Web Driver

package Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Textbox2 
{
  WebDriver driver;
	
	@BeforeTest
	
	public void launchbrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\Chrome Driver for selenium\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://magnus.jalaacademy.com/");
	}
	
	
	@Test
	public void locatortest()
	{
	WebElement wt=driver.findElement(By.name("UserName"));
	
	wt.sendKeys("training@jalaacademy.com");
	
	String st=wt.getAttribute("value");
	
	System.out.println(st);
	}
	
	@AfterTest

	public void closebrowser() {

		driver.close();

	}
	

}
