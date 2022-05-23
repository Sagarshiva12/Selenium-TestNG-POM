package Seleniummisc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Capturescreenshot 
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
	public void captureScreen() throws IOException, InterruptedException {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		
	    driver.findElement(By.name("Password")).sendKeys("jobprogram");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
	    Thread.sleep(2000);
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    
	    
	    File file= ts.getScreenshotAs(OutputType.FILE);
	    
	    FileUtils.copyFile(file,new File("C:\\Selenium\\5. Selenium Miscellaneous Scenarios\\Screenshot\\image.png"));//give save location
		
	}

	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
	}
}
