
//2. Find out number of elements in a radio group

package Radiobuttonorcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radiobutton2 
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
	public void radiobuttontest() throws InterruptedException {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("CSS Properties")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Buttons")).click();	
		
		
		List<WebElement>  ck= driver.findElements(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[10]/a02"));
		
		
		System.out.println(ck.size());
		  
		}
	

	
	@AfterTest
	 
	public void closebrowser() 
	{
		 
		driver.close();
	}
	
}
		
