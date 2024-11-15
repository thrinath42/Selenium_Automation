package TestNgAssignment;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerImply.class)
public class ComputersTNg extends BaseClass {
	
	@Test
	public void clickcomputer() throws InterruptedException {
		
		Computers co=new Computers(driver);
		co.getComputer().click();
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Compute", "Computers page not loaded");
		Reporter.log("Computers page loaded",true);
	}

}
