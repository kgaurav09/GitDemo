package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExmp {
	@Test
	public void alert() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		
		Alert al= driver.switchTo().alert();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		al.accept();
		driver.close();
		
	}

	@Test
	public void confirm()
	{
		int sum=0;
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		
		Alert al2= driver.switchTo().alert();
		
		System.out.println(driver.switchTo().alert().getText());
		
		al2.dismiss();
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[11]/td[3]")).getText());
		//driver.close();
		
		List<WebElement>el=driver.findElements(By.xpath("(//table[@id='product']/following::tbody)[1]/tr/td[4]"));
		System.out.println(el.size());
		
		for(int i=0;i<el.size();i++)
		{
			sum= sum+Integer.parseInt(el.get(i).getText());
			//System.out.println(sum);
		}
		System.out.println(sum);
	}
}
