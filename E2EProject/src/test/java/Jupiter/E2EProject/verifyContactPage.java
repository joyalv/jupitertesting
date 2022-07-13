package Jupiter.E2EProject;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.contactPage;
import resources.base;

public class verifyContactPage extends base {

	@Test
	public void validateContact() {

		contactPage ctpage = new contactPage(driver);
		ctpage.getCpageLink().click();
		Assert.assertEquals(ctpage.getMsg().getText(), "We welcome your feedback" + " - tell it how it is.");
		ctpage.getsubmitBtn().click();
		Assert.assertEquals(ctpage.getErrMsg().getText(),
				"We welcome your feedback" + " - but we won't get it unless you complete the form correctly.");
		Assert.assertEquals(ctpage.getMsgAlert().getText(), "Message is required");
		Assert.assertEquals(ctpage.getNameAlert().getText(), "Forename is required");
		Assert.assertEquals(ctpage.getEmailAlert().getText(), "Email is required");

	}

	@Test
	public void fillContacts() {

		contactPage ctpage = new contactPage(driver);
		ctpage.getCpageLink().click();
		ctpage.getFname().sendKeys("John");
		ctpage.getSurname().sendKeys("David");
		ctpage.getEmail().sendKeys("john@gmail.com");
		ctpage.getTelephone().sendKeys("044354363");
		ctpage.getMessage().sendKeys("happy with Items");
		ctpage.getsubmitBtn().click();
		Assert.assertEquals(ctpage.getThankMsg().getText(), "Thanks John" + ", we appreciate your feedback.");

	}

}
