package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumlocator4 
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
				
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("training@jalaacademy.com");
		
		driver.findElement(By.xpath("//input[@class='form-control' and @type='password']")).sendKeys("jobprogram");
		
		driver.findElement(By.partialLinkText("Sign")).click(); 
		Thread.sleep(5000);
	}
	
	
	@AfterTest
	public void closebrowser()
	{
		
		driver.close();
	}
		

}
