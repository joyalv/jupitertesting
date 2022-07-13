package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By username=By.cssSelector("input#loginUserName");
	By password=By.cssSelector("input#loginPassword");
	By login=By.cssSelector("button.btn.btn-primary");
	By cancel=By.cssSelector("button.btn.btn-cancel");
	By errormsg=By.cssSelector("div#login-error");
	
	public LoginPage(WebDriver driver)
	{
	
	this.driver=driver;
	}
	 public LoginPage() {
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getUname()
	 {
	
		return driver.findElement(username) ;
		
		
	 }
	 public WebElement getPassword()
	 {
		return driver.findElement(password);
	 }
	 public WebElement LoginBtn()
	 {
		return driver.findElement(login);
	 }
	 public WebElement cancelBtn()
	 {
		return driver.findElement(cancel);
	 }
	 public WebElement emsg()
	 {
		return driver.findElement(errormsg);
	 }
	 
}
