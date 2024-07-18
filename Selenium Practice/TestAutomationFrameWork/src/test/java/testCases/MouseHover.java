package testCases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	@Test(enabled=false)
	public void mouseHover() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement ele=driver.findElement(By.cssSelector("#mousehover"));
		
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)", "");
		 Thread.sleep(2000);
		
		Actions ac= new Actions(driver);
		ac.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.close();
		
	}

	@Test(priority=-1)
	public void autoSuggestion() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement ele=driver.findElement(By.cssSelector("#autocomplete"));
		/*
		 * ele.sendKeys("India"); Thread.sleep(2000); ele.sendKeys(Keys.CONTROL+"A");
		 * ele.sendKeys(Keys.BACK_SPACE); ele.sendKeys(Keys.ARROW_DOWN);
		 * ele.sendKeys(Keys.ARROW_DOWN); ele.sendKeys(Keys.ENTER); Thread.sleep(2000);
		 * driver.close();
		 */
		List<WebElement>webelements=driver.findElements(By.tagName("a"));
		
		System.out.println(webelements.size());
		
		
		
	}
}
