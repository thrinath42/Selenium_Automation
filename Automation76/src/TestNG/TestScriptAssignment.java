package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptAssignment extends BaseClassAssignment{
	
	@Test
	public void clickOnSales() throws InterruptedException {
		driver.findElement(By.partialLinkText("Sales")).click();
		
		Assert.assertEquals(driver.getTitle(), "SkillRary Ecommerce", "Sales Page not loaded");
		Reporter.log("SP not loaded");
		Thread.sleep(3000);
	}
	

}
