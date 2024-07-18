package testCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabHandling {
	@Test
	public void tabHandle()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.cssSelector("#opentab")).click();
		
		String parentwindow=driver.getWindowHandle();
		
	Set<String>windows=	driver.getWindowHandles();
	
	Iterator<String>I2= windows.iterator();
	
	while(I2.hasNext())
	{
		String childwindow= I2.next();
		if(!childwindow.equals(parentwindow))
		{
			driver.switchTo().window(childwindow);
			System.out.println(driver.switchTo().window(childwindow).getTitle());
			driver.close();
		}
		
	}
	driver.switchTo().window(parentwindow);
	System.out.println(driver.switchTo().window(parentwindow).getTitle());
	driver.close();
	}

}
