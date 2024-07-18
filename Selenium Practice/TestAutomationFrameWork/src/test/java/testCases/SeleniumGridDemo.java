package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
	@Test
	public void browserLaunch() throws MalformedURLException
	{
		try {
			/*
			 * DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
			 * desiredCapabilities.setBrowserName("chrome");
			 */
			//desiredCapabilities.setPlatform(Platform.XP);
			
			ChromeOptions options= new ChromeOptions();
			 WebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.3:4444/wd/hub"), options);
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.google.com/");
			 
			 System.out.println(driver.getTitle());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
