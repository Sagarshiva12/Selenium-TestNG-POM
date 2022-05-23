package DropdownorListboxorcombobox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SingleWindowhandle 
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
	
	 @Test()
		
		public void windowhandle() throws InterruptedException {
			
			driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
			
		    driver.findElement(By.name("Password")).sendKeys("jobprogram");
		    
		    driver.findElement(By.id("btnLogin")).click();
		    
		    String id= driver.getWindowHandle();         //will return only single/current window id ,will not handle multiple window
		    
		    System.out.println(" current window id "+id);

	     }
	   
	   
	   @AfterMethod
	   
	   public void tearDown() {
		   
		   //driver.quit();
	   }
	   

}
