package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestingUsingXML {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br, String ur) throws InterruptedException
	{
		
		switch (br.toLowerCase()) {
		case "chrome":driver= new ChromeDriver();
		break;
		
		case "edge":driver= new EdgeDriver();
		break;
		
		case "firefox":driver= new FirefoxDriver();
		break;
		
		default: System.out.println("Please provide valid browser");
		return;
		
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ur);
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	void getImage() throws InterruptedException
	
	{
		Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}
	@Test(priority = 2)
	void getTitle()
	{
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	void TearDown()
	{
		driver.close();
	}
}
