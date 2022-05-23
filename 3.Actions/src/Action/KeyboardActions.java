package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyboardActions 
{
WebDriver driver;
	
	@BeforeTest
	
	public void launchbrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\Chrome Driver for selenium\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://magnus.jalaacademy.com/");
	}
	

	@Test()
	
	   void tabPressAction() throws InterruptedException {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		
		Actions at=new Actions(driver);
		at.sendKeys(Keys.TAB)
		.sendKeys("jobprogram")
		
	
		.build().perform();		
	
	}
	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
				
	}
		
}
