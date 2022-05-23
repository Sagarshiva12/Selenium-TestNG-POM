package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHoverTest 
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
	
	public void mousehoverEvent() throws InterruptedException {
	
	driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

	driver.findElement(By.name("Password")).sendKeys("jobprogram");

	driver.findElement(By.id("btnLogin")).click();

	Thread.sleep(2000);
	
	

	driver.findElement(By.linkText("More")).click();

	Thread.sleep(1000);
	
	 WebElement tr=driver.findElement(By.linkText("Slider"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(tr).perform();
	

	
}


@AfterMethod

public void tearDown() {
	
	//driver.quit();
}




}



