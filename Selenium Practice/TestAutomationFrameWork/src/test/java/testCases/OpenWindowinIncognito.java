package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWindowinIncognito {
	@Test
	public void Incognito()
	{
		
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("incognito");
		option.addArguments("--disable-notifications");
      
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.google.com/");
		
	}

}
