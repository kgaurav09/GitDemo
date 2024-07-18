package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	@Test
	public void drpdwn() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			driver.findElement(By.cssSelector("#checkBoxOption1")).click();
			
			
			
			/*
			 * List<WebElement> ele=
			 * driver.findElements(By.cssSelector("#checkbox-example"));
			 * 
			 * for(int i=0;i<ele.size();i++) { ele.get(i).click(); Thread.sleep(2000);
			 * System.out.println(ele.get(i).getText()); }
			 */
		driver.close();
	}

}
