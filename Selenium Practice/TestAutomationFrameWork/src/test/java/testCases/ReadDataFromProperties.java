package testCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class ReadDataFromProperties {
	
	
	
	
	
	
	
	WebDriver driver;
	
	
	@Test
	public void InvokeBrowser() throws IOException
	{
		
		FileReader reader= new FileReader("C:\\Users\\kumar.gaurav\\GitworkingRepo\\Selenium Practice\\TestAutomationFrameWork\\src\\test\\java\\testCases\\data.properties");
		
		Properties prop= new Properties();
		prop.load(reader);
		 
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
			
		}
		driver.get(prop.getProperty("url"));
	}
	

}
