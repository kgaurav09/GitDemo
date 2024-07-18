package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	WebDriver driver;
	SoftAssert sa= new SoftAssert();
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
	}
	@Test(dataProvider="dp")
	void TestLogin(String email1, String pwd)
	{
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(email1);
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);
		
		WebElement btn=driver.findElement(By.id("loginbutton"));
		btn.click();
		
		sa.assertAll();
		
		
	}	
	@AfterClass
	void TearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name="dp", indices = {0,3})
	public Object[][] LoginData()
	{
		Object data[][]= {
				{"k@gmail.com","test123"},
				{"g@gmail.com","test12"},
				{"n@gmail.com","test1"},
				{"gauravrajput216@gmail.com","Bottle@0904"},
				{"h@gmail.com","gh@123"}
		};
		
		return data;
		
	}
	
}
