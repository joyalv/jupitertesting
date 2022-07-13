package Jupiter.E2EProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.cartPage;
import pageObjects.shopPage;
import resources.base;

public class validateShoppingPage extends base {

	@Test
	public void verifyShoppingItems() {

		shopPage spage = new shopPage(driver);
		spage.getLink().click();
		String[] toyNames = { "Teddy Bear", "Stuffed Frog", "Handmade Doll", "Fluffy Bunny", "Smiley Bear", "Funny Cow",
				"Valentine Bear", "Smiley Face" };
		String[] toyPrice = { "$12.99", "$10.99", "$10.99", "$9.99", "$14.99", "$10.99", "$14.99", "$9.99" };

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='products ng-scope']//li"));
		for (int i = 1; i <= products.size(); i++) {
			String ToyName = driver.findElement(By.xpath("//div[@class='products ng-scope']//li[" + i + "]//h4"))
					.getText();
			Assert.assertEquals(ToyName, toyNames[i - 1]);
			String ToyPrice = driver.findElement(By.xpath("//div[@class='products ng-scope']//li[" + i + "]//span"))
					.getText();
			Assert.assertEquals(ToyPrice, toyPrice[i - 1]);

		}
	}

	@Test
	public void verifyAddCart() {
		shopPage spage = new shopPage(driver);
		cartPage cpage = new cartPage(driver);
		String[] toyNeeded = { "Stuffed Frog", "Smiley Bear", "Valentine Bear", };
		List itemsNeededList = Arrays.asList(toyNeeded);
		spage.getLink().click();
		spage.addItems(itemsNeededList);
		Assert.assertEquals(cpage.getCartCount().getText().trim(), Integer.toString(toyNeeded.length));
		ArrayList<String> list = new ArrayList<String>();
		cpage.getCart().click();
		List<WebElement> cartedItems = driver.findElements(By.xpath("//tr[@class='cart-item ng-scope']"));
		for (int i = 1; i <= cartedItems.size(); i++) {
			String itemName = driver.findElement(By.xpath("//tr[@class='cart-item ng-scope'][" + i + "]//td"))
					.getText();
			System.out.println("The item in the cart is" + itemName);
			// create cart array list and add items to the list
			list.add(itemName);// Adding object in arraylist

			System.out.println("The items added is" + list);
		}
		Assert.assertEquals(list, itemsNeededList);
	}

	@Test
	public void verifyDeleteCart() {

		shopPage spage = new shopPage(driver);
		cartPage cpage = new cartPage(driver);

		spage.getLink().click();

		String[] toyNeeded = { "Stuffed Frog", "Smiley Bear", "Valentine Bear", };
		List itemsNeededList = Arrays.asList(toyNeeded);

		spage.getLink().click();
		spage.addItems(itemsNeededList);

		Assert.assertEquals(cpage.getCartCount().getText().trim(), Integer.toString(toyNeeded.length));
		cpage.getCart().click();
		ArrayList<String> list = new ArrayList<String>();
		List<WebElement> cartedItems = driver.findElements(By.xpath("//tr[@class='cart-item ng-scope']"));
		for (int i = 1; i <= cartedItems.size(); i++) {
			String itemName = driver.findElement(By.xpath("//tr[@class='cart-item ng-scope'][" + i + "]//td"))
					.getText();
			System.out.println("The item in the cart is" + itemName);

			// create cart array list and add items to the list
			// Creating arraylist
			list.add(itemName);// Adding object in arraylist

			System.out.println("The items added is" + list);
		}
		Assert.assertEquals(list, itemsNeededList);
		cpage.getemptyCart().click();
		cpage.getClarifyBtn().click();
		Assert.assertTrue(
				cpage.getAlertMsg().getText().contains("Your cart is empty" + " - there's nothing to see here."));
	}

}
