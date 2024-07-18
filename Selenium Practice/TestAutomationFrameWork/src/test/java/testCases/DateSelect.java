package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateSelect {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.com/");
	driver.findElement(By.xpath("//button[@class='sc-fjdhpX jxFepI']")).click();
	driver.findElement(By.id("onward_cal")).click();
	
	String year="2023";
	String month="December";
	String date="24";
	
	while(true)
	{
		String monthyear=driver.findElement(By.xpath("(//div[@class='DayNavigator__CalendarHeader-sc-1tlckkc-1 ccLrBz'])[1]")).getText();
		String arr[]=monthyear.split(" ");
		String mon=arr[0];
		String yr=arr[1];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) 
			break;
		else {
			
		}
	}

		List<WebElement> alldates=driver.findElements(By.xpath("(//span[@class='DayTilesWrapper__DayWrapper-moo2xh-1 loqlv'])[1]//child::span"));
		
		for (WebElement ele : alldates) {
			
			String date1 = ele.getText();
			
			
				if (date1.equals(date)) {
					ele.click();
					break;
				}
			}
		driver.close();
			
		}
	}
	
	
	
	
	
	



