package Jupiter.E2EProject;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.cartPage;
import pageObjects.checkoutPage;
import pageObjects.shopPage;
import resources.base;

//public class VerifyCheckoutPage extends validateShoppingPage {
public class VerifyCheckoutPage extends base {
	@Test
	public void validateCheckOutForm() {
		checkoutPage checkpage = new checkoutPage(driver);
		shopPage spage = new shopPage(driver);
		cartPage cpage = new cartPage(driver);
		String[] toyNeeded = { "Stuffed Frog", "Smiley Bear", "Valentine Bear", };
		List itemsNeededList = Arrays.asList(toyNeeded);
		spage.getLink().click();
		spage.addItems(itemsNeededList);
		cpage.getCart().click();
		checkpage.getCheckBtn().click();
		checkpage.getCardType().click();
		checkpage.getCardNumber().click();
		checkpage.getSubmitBtn().click();
		Assert.assertEquals(checkpage.getPageErrMsg().getText(),
				"Almost there" + " - but we can't send your items unless you complete the form correctly.");
		Assert.assertEquals(checkpage.getForenameErr().getText(), "Forename is required");
		Assert.assertEquals(checkpage.getMailErr().getText(), "Email is required");
		Assert.assertEquals(checkpage.getAddressErr().getText(), "Address is required");
		Assert.assertEquals(checkpage.getCardTypeErr().getText(), "Card Type is required");
		Assert.assertEquals(checkpage.getCardNumErr().getText(), "Credit Card is required");

	}

}
