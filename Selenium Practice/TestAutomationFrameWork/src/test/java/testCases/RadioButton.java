package testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	@SuppressWarnings("deprecation")
	@Test
	public void RadioButtonCheck() throws InterruptedException
	{
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	String title=driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Practice Page",title );
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebElement radioButton=driver.findElement(By.xpath("//input[@value='radio1']"));
	 boolean selectState=radioButton.isEnabled();
	 //boolean isSelected=radioButton.isSelected();
	 
	if(selectState==true)
	{
		radioButton.click();
		Thread.sleep(2000);
		
		
	}
	/*
	 * boolean isSelected=radioButton.isSelected(); elseif(isSelected==true) {
	 * System.out.println("Radio button1 is selected ");
	 * 
	 * }
	 */
	
	 driver.close();
	}

	private void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
