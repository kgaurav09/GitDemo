package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DP {
	@Test(dataProvider="logindata")
	public void FbLogin(String uname, String pwd)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
  
	
@DataProvider(name="logindata")
public Object[][] TestDatafFeed()
{
	Object[][] fbdata=new Object[2][2];
	
	fbdata[0][0]="username1@gmail.com";
	fbdata[0][1]="Password1";
	fbdata[1][0]="username2@gmail.com";
	fbdata[1][1]="Password2";
	return fbdata;
	
	
	}
}
