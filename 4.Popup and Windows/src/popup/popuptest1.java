package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class popuptest1 
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
	public void popup() throws InterruptedException {

		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Popups")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();

		Alert aler = driver.switchTo().alert();

		System.out.println(aler.getText());

		aler.accept();

	}

	@AfterMethod

	public void closebrowser() {

		// driver.close();

	}

}

