package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	public WebDriver driver;
	
	By heading=By.tagName("h1");
	By subheading=By.cssSelector("small.muted");
	By welcomeMsg=By.cssSelector("p.lead");
	By shoppingBtn=By.cssSelector("a.btn.btn-success.btn-large");
	
	public homePage(WebDriver driver)
	{
	
	this.driver=driver;
	}
	
	public WebElement getHead()
	 {
	
		return driver.findElement(heading);
		
		
	 }
	public WebElement subHead()
	{
		
		return driver.findElement(subheading);
		
		
	}
	public WebElement welMsg()
	{
		return driver.findElement(welcomeMsg);
	}
	public WebElement shopBtn()
	{
		return driver.findElement(shoppingBtn);
	}

}
