package listener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(implementationClassOne.class)
public class TestScriptOne extends BaseClass {

		@Test
		public void login() throws InterruptedException {
			driver.findElement(By.partialLinkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("abhis@1234");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(3000);
			
			Assert.assertEquals(driver.getTitle(), "Demo Web","HP not displayed");
			Reporter.log("HP dispalyed",true);
		}
}
