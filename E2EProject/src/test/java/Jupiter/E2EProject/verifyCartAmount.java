package Jupiter.E2EProject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.cartPage;
import pageObjects.shopPage;
import resources.base;

public class verifyCartAmount extends base{
	
@Test
public void validateCartAmount()
{
	 float itemtotal=0;
	 cartPage cpage=new cartPage(driver);
	 shopPage spage=new shopPage(driver);
	 
	  String[] toyNeeded= {"Stuffed Frog","Smiley Bear","Valentine Bear",}; 
	  List itemsNeededList=Arrays.asList(toyNeeded);
	  spage.getLink().click();
	  spage.addItems(itemsNeededList);
	  cpage.getCart().click();
	 List<WebElement> itemsPrice= driver.findElements(By.xpath("//table[@class='table table-striped cart-items']//tbody//tr"));
     for(int i=1;i<=itemsPrice.size();i++)
     {
   	 String[] price=driver.findElement(By.xpath("//table[@class='table table-striped cart-items']//tbody//tr["+i+"]//td[4]")).getText().split("\\$");
   	 System.out.println(price[1]);
   	 float itemPrice=Float.parseFloat(price[1]); 
   	 itemtotal=itemtotal+itemPrice;
   	 System.out.println("total"+itemtotal);	
     
  }
     String[] value=cpage.getCartTotal().getText().split(":");
     float valueTotal= Float.parseFloat(value[1]); 
     Assert.assertEquals(valueTotal,itemtotal );	
}	
	
}
