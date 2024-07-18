package testCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {
	@Test
	public void swtwindow()
	{
		
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		
		String st=driver.findElement(By.cssSelector("#openwindow")).getText();
		System.out.println(st);
		driver.findElement(By.cssSelector("#openwindow")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String>s=driver.getWindowHandles();
		
		Iterator<String> i1= s.iterator();
		
		while(i1.hasNext())
		{
			String child_window= i1.next();
			
			if (!parent.equals(child_window)) {
				
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
				
			}
			
			
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.switchTo().window(parent).getTitle());
		driver.close();
		
		
	}

}
