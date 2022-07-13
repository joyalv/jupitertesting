package Jupiter.E2EProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.landingPage;
import resources.base;

public class validateLoginPage extends base {

	@Test
	public void verifyLoginPage() throws IOException {
		landingPage lanpage = new landingPage(driver);
		lanpage.getLogin().click();
		LoginPage logpage = new LoginPage(driver);
		logpage.getUname().sendKeys("username");
		logpage.getPassword().sendKeys("pass123");
		logpage.LoginBtn().click();
		Assert.assertEquals(logpage.emsg().getText(), "Your login details are incorrect");
	}

}
