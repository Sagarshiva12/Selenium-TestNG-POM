
//1. How to Type in text box using Selenium Web Driver

package Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Textbox1 
{	
	
	WebDriver driver;
	
	@BeforeTest
	
	public void sagar()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\Chrome Driver for selenium\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://magnus.jalaacademy.com/");
	}
	
	
	// 1] typing in text box by using sendKeys
	@Test(priority=1)
	public void sagar1()
	{
	driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}
	
	
	
	// 2] typing in text box by using javaScriptExecutor
	@Test(priority=2)
	public void sagar2()
	{
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
	}

	
	@AfterTest

	public void closebrowser() 
	{

		driver.close();
	}
	
}

	