package Jupiter.E2EProject;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import pageObjects.homePage;
import resources.base;

public class validateHomePage extends base {

	@Test
	public void verifyHomePage() throws IOException {
		homePage home = new homePage(driver);
		Assert.assertEquals(home.getHead().getText(), "Jupiter Toys");
		Assert.assertEquals(home.subHead().getText(),
				"toys, games, puzzles, art and craft, novelties, teddy bears, bicycles, kites, models, sports, gifts...");
		Assert.assertEquals(home.welMsg().getText(),
				"Welcome to Jupiter Toys, a magical world for good girls and boys.");
		home.shopBtn().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://jupiter.cloud.planittesting.com/#/shop");

	}
}
