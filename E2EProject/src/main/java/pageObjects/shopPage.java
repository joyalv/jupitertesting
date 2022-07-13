package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class shopPage {

	public WebDriver driver;
	By shopLink = By.cssSelector("li#nav-shop");
	By buyBtn = By.cssSelector("");

	public shopPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getLink() {
		return driver.findElement(shopLink);
	}

	public void addItems(List itemsNeededList) {

		int j = 0;
		ArrayList<String> list = new ArrayList<String>();
		List<WebElement> products = driver.findElements(By.cssSelector(".product-title.ng-binding"));
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();

			if (itemsNeededList.contains(name)) {
				j++;
				driver.findElements(By.cssSelector(".btn.btn-success")).get(i).click();
				if (j == itemsNeededList.size()) {
					break;
				}
			}
		}
	}

}
