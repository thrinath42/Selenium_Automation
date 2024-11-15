package TestNgAssignment;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImply.class)
public class GiftTNg extends BaseClass {
	
	
	@Test
	public void clickgift() throws InterruptedException {
		Giftcards gf=new Giftcards(driver);
		gf.getGift().click();
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Demo Shop. Gift Cards", "Gift Cards page not loaded");
		Reporter.log("Gift Cards page loaded",true);
	}

}
