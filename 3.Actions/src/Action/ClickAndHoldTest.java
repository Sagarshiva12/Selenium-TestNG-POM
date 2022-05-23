package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickAndHoldTest 
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

	public void clickAndholdevent() throws InterruptedException {

		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(1000);

		

		

		WebElement ele = driver.findElement(By.xpath("//div[@id='blue']/child::div[1]/descendant::div[3]"));  // Locate the
																										      // element slider by
																										      // By.xpath.

		Actions act = new Actions(driver);  // Create an object of actions class and pass reference of WebDriver as a
											// parameter to its constructor.

		act.moveToElement(ele).clickAndHold().perform();    // Move the cursor to the position of slider and perform
															// click and hold action

	}

	@AfterMethod

	public void tearDown() 
	{

		//driver.quit();
	}
}

