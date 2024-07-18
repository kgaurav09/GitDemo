package testCases;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
	
	@Test
	public void MultipleTab() throws InterruptedException
	{ 
		String titleOfPage="";
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.id("openwindow")).click();
		
		/*
		 * String parentWindowID=driver.getWindowHandle();
		 * System.out.println("parent window handle  "+parentWindowID);
		 */
		
		Set<String>windowsId=driver.getWindowHandles();
		System.out.println("All window handles id  "+windowsId);
		
		System.out.println(windowsId.size());
		
		for(String winID:windowsId)
		{
			
		 String title=driver.switchTo().window(winID).getTitle();
		
		 System.out.println(title);
		 
		 String expectedTitle="Practice Page";
		 
		 if(title.equals(expectedTitle))
		 {
			 
			//driver.findElement(By.xpath("//div[@id='navbarSupportedContent']//following-sibling::li/a[text()='Courses']")).click();
			
			Thread.sleep(2000);
			driver.close();
		 }
					
		}
		
		}

}
