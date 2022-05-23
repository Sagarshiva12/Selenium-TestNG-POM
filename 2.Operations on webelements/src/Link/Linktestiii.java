package Link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Linktestiii 
{
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shiva\\\\Downloads\\\\Chrome Driver for selenium\\\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("http://magnus.jalaacademy.com/Account/Login");
		
		
	}  
	
	
	
	
	@Test
	public void linktestt() throws InterruptedException {
		
		
		
		//int a=links.size();
		
		//System.out.println(a);
		
		//for(int i=0;i<=links.size();i++) {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Links")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Working ")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
			for(WebElement linkss:links) {
				
				System.out.println(linkss.getText());
			}	}
	

	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
		
	}
	
	
}
