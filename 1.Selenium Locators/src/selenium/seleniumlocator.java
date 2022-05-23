package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocator 
{
	public static void main(String[]args)
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\Chrome Driver for selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magnus.jalaacademy.com/");
		
		
		//id
		//driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");	
		
		
		//name
		//driver.findElement(By.name("Password")).sendKeys("jobprogram");
		
		
		//className
		//driver.findElement(By.className("form-control input-validation-error")).sendKeys("jobprogram");
		
		
		//xpath
		//driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
		
		
		//cssSelector
		//driver.findElement(By.cssSelector("#Password")).sendKeys("jobprogram");
		
		
		
		//LinkText
		//driver.findElement(By.linkText("Forgot Password")).click();
		
		
		
		//PartialLinkText
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		//Tag Name
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.print("The number of input boxes on webpage are : "+elements.size());
			
	}

}








