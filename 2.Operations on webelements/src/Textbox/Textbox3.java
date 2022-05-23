
//3. How to read the placeholder value of a Text Box using getAttribute() method

package Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Textbox3
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
			public void getAttributeVal() 
			{
		
	        WebElement wr=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/input"));
	        
	        String sr=wr.getAttribute("placeholder");
	        
	        System.out.println(sr);
			}
			
			@AfterTest

			public void closebrowser() {

				driver.close();

			}

}
