package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScript {
		@Test
		public void login() {
			Reporter.log("launch the browser",true);
			Reporter.log("Navigate to url",true);
			Reporter.log("Click on login link",true);
			Reporter.log("Enter Valid Credentials",true);
			Reporter.log("click on login button",true);
			Assert.assertEquals(true, false);
		}
}
