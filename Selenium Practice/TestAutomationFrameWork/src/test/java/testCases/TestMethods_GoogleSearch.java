package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.FacebookPage;
import PageObjects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	GoogleSearchPage objectrepo;
	
	@BeforeTest
	public void beforeTest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void SearchOperation() 
	{	
		GoogleSearchPage page= new GoogleSearchPage(driver);
		
		page.searchGoogle("facebook");
	}
	@Test
	public void VerifyAndAccessFacebook() 
	{	
		objectrepo=new GoogleSearchPage(driver);
		objectrepo.clickFacebook();
	}
	
	@Test
	public void VerifyLogin()
	{
		FacebookPage page= new FacebookPage(driver);
		page.EnterUserName();
		page.EnterPassword();
		page.VerifyLogin();
	}
	
	
	@AfterTest
	public void afterTest() {
		
		driver.quit();
		
	}
	

}
