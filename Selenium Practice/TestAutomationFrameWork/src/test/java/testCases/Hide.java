package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hide {
	@Test
	public void HideAndShow()
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 driver.findElement(By.id("hide-textbox")).click();
		 
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
		 String s= (String) js.executeScript("return document.getElementById('displayed-text').value");
		 
		 System.out.println("Value entered in hidden field: " +s);
		 driver.close();
		 
		 
	}

}
