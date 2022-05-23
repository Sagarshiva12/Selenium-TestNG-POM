package DropdownorListboxorcombobox;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlingtest
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
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("More")).click();
	  
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("Popups")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("Popup One")).click();
	    Thread.sleep(2000);
	    
	    Set<String> handler=driver.getWindowHandles();    // getWindowhandlers will give Set object of string type .will have two window's id
	    
	    Iterator<String> it=handler.iterator();           //to get window id's by using iterator()  because Set will not store value according to index
	    
	    String parentWindowId=it.next();
	    
	    System.out.println(parentWindowId);
	    
	    String childWindowId=it.next();
	    
	    System.out.println(childWindowId);
	    
	    driver.switchTo().window(childWindowId);
	    
	    Thread.sleep(2000);
	    
	    System.out.println("childwindow title "+driver.getTitle());
	    
	    driver.close();
	    
	    driver.switchTo().window(parentWindowId);
	    
	    Thread.sleep(2000);
	    
	    System.out.println("parentwindow title "+driver.getTitle());

		}
	
	
	
	@AfterMethod
	
	public void teardown() 
	{
		
		//driver.quit();
	}


}
