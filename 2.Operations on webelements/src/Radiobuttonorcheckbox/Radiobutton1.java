//1. Selecting the Radio Button by Label Text / value
//6.Check if Radio Button is enabled or disabled?
package Radiobuttonorcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radiobutton1 
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
	public void radioop() throws InterruptedException
	{
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("CSS Properties")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Buttons")).click();
		
		
		
		
		//buttons is enabled or not
		
		Boolean d= driver.findElement(By.xpath("//*[@id=\"frmCssProperties\"]/div/div/div/div/ul/li[3]/a")).isEnabled();
		
	
		
		Thread.sleep(2000);
		
	
	
	   System.out.println(d);
		
		 
		
		
		}

	
	@AfterTest
	
	public void closebrowser() {
		
		driver.close();
		
		
	}
}
