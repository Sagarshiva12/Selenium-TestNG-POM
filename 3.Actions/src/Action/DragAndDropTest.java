package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropTest 
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
	
	public void dragAnddrop() throws InterruptedException {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(1000);

		WebElement w1=driver.findElement(By.xpath("//div[@id='blue']/child::div[1]/descendant::div[1]"));
		
		WebElement w2=driver.findElement(By.xpath("//div[@id='blue']/child::div[1]/descendant::div[4]"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.clickAndHold(w1).moveToElement(w2)
		
		.release().build().perform();
		
		
	}
		
	
	
	@AfterMethod
	
	public void tearDown() {
		
		//driver.quit();
	}
	

}



