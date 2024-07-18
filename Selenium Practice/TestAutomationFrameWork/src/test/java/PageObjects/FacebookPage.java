package PageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FacebookPage {
	WebDriver driver;
	
	public FacebookPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By username= By.id("email");
	By pwd= By.id("pass");
	By login_btn=By.xpath("//button[@name='login']");
	
	
	public void EnterUserName()
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("TestUser");
	}
	
	public void EnterPassword()
	{
		driver.findElement(pwd).clear();
		driver.findElement(pwd).sendKeys("Tester123");
	}
	
	public void VerifyLogin()
	{
		driver.findElement(login_btn).click();
		String title=driver.getTitle();
		
		assertEquals(title, "Log in to Facebook");
	}
	

	
	
}
