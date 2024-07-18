package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
		
		
	}

	By searchbox= By.id("APjFqb");
	By searchButton= By.xpath("(//input[@name='btnK'])[1]");
	By facebookLink= By.xpath("//a//h3[text()='Facebook - log in or sign up']");
	
	public void searchGoogle(String searchInput) 
	{
		try {
			driver.findElement(searchbox).sendKeys(searchInput);
			driver.findElement(searchButton).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void clickFacebook()
	{
		try {
			driver.findElement(facebookLink).click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
