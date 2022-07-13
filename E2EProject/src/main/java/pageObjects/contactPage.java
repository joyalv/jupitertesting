package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class contactPage {

	public WebDriver driver;
	By cPageLink=By.xpath("//li[@id='nav-contact']//a");
	By submitBtn=By.cssSelector(".btn-contact.btn.btn-primary");
	By msgAlert=By.cssSelector("span#message-err");
	By nameAlert=By.cssSelector("span#forename-err");
	By emailAlert=By.cssSelector("span#email-err");
	By welcomeMsg=By.cssSelector("div.alert.alert-info.ng-scope");
	By errMsg=By.cssSelector("div.alert.alert-error.ng-scope");
	By fname=By.cssSelector("input#forename");
	By sname=By.cssSelector("input#surname");
	By email=By.cssSelector("input#email");
	By tele=By.cssSelector("input#telephone");
	By message=By.cssSelector("textarea#message");
	By thanksMsg=By.cssSelector("div.alert.alert-success");
	
	public contactPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement getCpageLink()
	{
		
		return driver.findElement(cPageLink);
		
	}
	public WebElement getsubmitBtn()
	{
		return driver.findElement(submitBtn);
	}
	
	public WebElement getMsgAlert()
	{
		return driver.findElement(msgAlert);

	}
	
	public WebElement getNameAlert()
	{
		return driver.findElement(nameAlert);
		
	}
	
	public WebElement getEmailAlert()
	{
		return driver.findElement(emailAlert);
		
	}
	
	public WebElement getMsg()
	{
		return driver.findElement(welcomeMsg);
	}
	public WebElement getErrMsg()
	{
		return driver.findElement(errMsg);
	}
	
	public WebElement getFname()
	{
		return driver.findElement(fname);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getMessage()
	{
		return driver.findElement(message);
	}
	
	public WebElement getThankMsg()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(thanksMsg));
		return driver.findElement(thanksMsg);
	}
	
	public WebElement getSurname()
	{
		return driver.findElement(sname);
	}
	
	public WebElement getTelephone()
	{
		return driver.findElement(tele);
	}
	
	
	
}
