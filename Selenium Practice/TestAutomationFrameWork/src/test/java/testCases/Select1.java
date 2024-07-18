package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select1 {



	@Test
	public void SelectAllOptionsCheck() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Select objSelect =new Select(driver.findElement(By.id("dropdown-class-example")));
		
		//Select sc= new Select(driver.findElement(By.id("dropdown-class-example")));
		
		/*
		 * objSelect.selectByVisibleText("Option1"); Thread.sleep(2000);
		 * 
		 * objSelect.selectByIndex(3);
		 */
		//objSelect.selectByValue("option2");
		
		
		List<WebElement>alloptions =objSelect.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText());
			if(alloptions.get(i).getText().equals("Option3"))
			{
				alloptions.get(i).click();
			}
		}
		//objSelect.deselectAll();
		
		//java.lang.UnsupportedOperationException: You may only deselect all options of a multi-select
		
	driver.close();
	}
}
