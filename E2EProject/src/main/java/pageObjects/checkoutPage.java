package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {

	public WebDriver driver;
	
	By checkBtn=By.cssSelector("a.btn-checkout.btn.btn-success.ng-scope");
	By checkMsg=By.cssSelector("div.alert.alert-info.ng-scope");
	By forename=By.cssSelector("input#forename");
	By foreNameErr=By.cssSelector("#forename-err");
	By mail=By.cssSelector("input#email");
	By mailErr=By.cssSelector("#email-err");
	By Address=By.cssSelector("textarea#address");
	By AddressErr=By.cssSelector("#address-err");
	By cardType=By.cssSelector("select#cardType");
	By cardTypeErr=By.cssSelector("select#cardType+span");
	By cardNumber=By.cssSelector("input#card");
	By cardNumberErr=By.cssSelector("input#card+span");
	By submitBtn=By.cssSelector("#checkout-submit-btn");
	By pageErrMsg=By.cssSelector(".alert.alert-error.ng-scope");
	By conformMsg=By.cssSelector("div.alert.alert-success");
	By ordernum=By.cssSelector("div.alert.alert-success > strong+strong");
	
	public checkoutPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement getCheckBtn()
	{
		
		return driver.findElement(checkBtn);
		
	}
	public WebElement getCheckMsg()
	{
		
		return driver.findElement(checkMsg);
		
	}
	public WebElement getForename()
	{
		
		return driver.findElement(forename);
		
	}
	public WebElement getmail()
	{
		
		return driver.findElement(mail);
		
	}
	public WebElement getAddress()
	{
		
		return driver.findElement(Address);
		
	}
	public WebElement getCardType()
	{
		
		return driver.findElement(cardType);
		
	}
	public WebElement getCardNumber()
	{
		
		return driver.findElement(cardNumber);
		
	}
	
	public WebElement getSubmitBtn()
	{
		
		return driver.findElement(submitBtn);
		
	}
	
	public WebElement getForenameErr()
	{
		
		return driver.findElement(foreNameErr);
		
	}
	
	public WebElement getMailErr()
	{
		
		return driver.findElement(mailErr);
		
	}
	
	public WebElement getAddressErr()
	{
		
		return driver.findElement(AddressErr);
		
	}
	
	public WebElement getCardTypeErr()
	{
		
		return driver.findElement(cardTypeErr);
		
	}
	
	public WebElement getCardNumErr()
	{
		
		return driver.findElement(cardNumberErr);
		
	}
	public WebElement getPageErrMsg()
	{
		
		return driver.findElement(pageErrMsg);
		
	}
	
	public WebElement getConformMsg()
	{
		
		return driver.findElement(conformMsg);
		
	}
	public WebElement getOrdereNum()
	{
		
		return driver.findElement(ordernum);
		
	}
	
	
}
