
//4.Deleting/clear text from the Text Box

package Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Textbox4 
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
	public void locatortest() throws InterruptedException
	{
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/input")).sendKeys("training@jalaacademy.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/input")).clear();
	}
	
	
	@AfterTest

	public void closebrowser() 
	{

		driver.close();

	}

 	
}
