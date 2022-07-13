package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage {

	public WebDriver driver;	
	By cartBtn=By.cssSelector("#nav-cart");
	By cartCount=By.xpath("//li[@id='nav-cart']//a//span");
	By emptyCartBtn=By.cssSelector(".btn.btn-danger.ng-scope");
	By clarifyMsg=By.xpath("//div[@class='modal-footer']//a[1]");
	By alertMsg=By.cssSelector("div.alert");
	By cartTotal=By.cssSelector(".total.ng-binding");
	
public cartPage(WebDriver driver)	
{
	this.driver=driver;
}
	
	
	
	public WebElement getCart()
	{
		
		return driver.findElement(cartBtn);
	}
	
	
	public WebElement getCartCount()
	{
		
		return driver.findElement(cartCount);
	}
	
	public WebElement getemptyCart()
	{
		
		return driver.findElement(emptyCartBtn);
	}
	
	public WebElement getClarifyBtn()
	{
		
		return driver.findElement(clarifyMsg);
	}
	
	public WebElement getAlertMsg()
	{
		
		return driver.findElement(alertMsg);
	}
	
	public WebElement getCartTotal()
	{
		
		return driver.findElement(cartTotal);
	}
	

	
}
