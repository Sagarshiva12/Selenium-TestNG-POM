package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumlocator2
{
	WebDriver driver;
	@BeforeTest
		
	public void launchbrowser() 
	 {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\Chrome Driver for selenium\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	   
	driver.manage().deleteAllCookies();
	
	driver.get("https://magnus.jalaacademy.com/");
	}
	
	@Test
	public void locatortest() throws InterruptedException
	{
	
	driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	
	driver.findElement(By.cssSelector("#Password")).sendKeys("jobprogram");
	
	driver.findElement(By.className("_btn btn-primary btn-flat")).click(); //failed bcoz class name is not unique  ...
	Thread.sleep(5000);
	}
	
	@AfterTest
	public void closebrowser()
	{
		
		driver.close();
	}
}
