package TestNgAssignment;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElectronicsTNg extends BaseClass {
	
	@Test
	public void clickelectronic() throws InterruptedException {
		Electronics el=new Electronics(driver);
		el.getElectronics().click();
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics", "Electronics page not loaded");
		Reporter.log("Electronics page loaded",true);
	}
}
