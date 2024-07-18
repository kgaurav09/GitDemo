package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TakeScreenshots {
	
	WebDriver driver;
	
	@Test
	void TakeFullPageScreenShot() throws IOException
	{ 
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File tar= new File(".\\Screenshots\\homepage.png");
		
		FileUtils.copyFile(src, tar);
		
		driver.close();	
		
	}
	@Test(priority = 1)
	void TakeScreenShotAtSectionOFPage()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://demo.nopcommerce.com/");
				
		WebElement ele=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src1=ele.getScreenshotAs(OutputType.FILE);
		File tag1=new File(".\\Screenshots\\section.png");
		try {
			FileUtils.copyFile(src1, tag1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		
	}
	
	@Test(priority = 2)
	void TakeScreenShotAtElementOFPage()
	{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	
	driver.get("https://demo.nopcommerce.com/");
	
	WebElement ele=driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']"));
	
	File src1=ele.getScreenshotAs(OutputType.FILE);
	File tag1=new File(".\\Screenshots\\element.png");
	try {
		FileUtils.copyFile(src1, tag1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
	
	}

}
