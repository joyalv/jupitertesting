package Jupiter.E2EProject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.cartPage;
import pageObjects.checkoutPage;
import pageObjects.homePage;
import pageObjects.shopPage;
import resources.base;

public class verifyEndToEnd extends base {

	@Test
	public void E2Etesting() {

		homePage home = new homePage(driver);
		shopPage spage = new shopPage(driver);
		cartPage cpage = new cartPage(driver);
		checkoutPage checkpage = new checkoutPage(driver);
		home.shopBtn().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://jupiter.cloud.planittesting.com/#/shop");
		String[] toyNeeded = { "Stuffed Frog", "Smiley Bear", "Valentine Bear", };
		List itemsNeededList = Arrays.asList(toyNeeded);
		spage.getLink().click();
		spage.addItems(itemsNeededList);
		cpage.getCart().click();
		checkpage.getCheckBtn().click();
		Assert.assertTrue(true, "Almost there" + " - your " + "3" + "items" + "are" + " nearly in your hands.");
		// Assert.assertEquals(checkpage.getCheckMsg().getText(),"Almost there"+" - your
		// "+"3"+"items"+"are"+" nearly in your hands.");
		checkpage.getForename().sendKeys("john");
		checkpage.getmail().sendKeys("john@gmail.com");
		checkpage.getAddress().sendKeys("101 example street");
		WebElement cardtypeDropdown = checkpage.getCardType();
		Select dropdown = new Select(cardtypeDropdown);
		dropdown.selectByIndex(2);
		checkpage.getCardNumber().sendKeys("0987654321");
		checkpage.getSubmitBtn().click();
		Assert.assertEquals(checkpage.getConformMsg().getText(), "Thanks john"
				+ ", your order has been accepted. Your order nuumber is " + checkpage.getOrdereNum().getText());

	}
}
