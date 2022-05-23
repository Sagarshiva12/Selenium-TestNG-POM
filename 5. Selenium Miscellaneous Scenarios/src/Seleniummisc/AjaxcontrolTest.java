package Seleniummisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AjaxcontrolTest
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
	
	public void ajaxAutoSuggest() throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("selenium");
	
	Thread.sleep(2000);
	String str=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/input")).getText();
	
	System.out.println(str);
	
	}


@AfterMethod

public void tearDown() {
	
	//driver.quit();
}



}
