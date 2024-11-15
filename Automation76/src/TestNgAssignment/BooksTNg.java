package TestNgAssignment;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BooksTNg extends BaseClass{

	
	@Test
	public void clickbooks() throws InterruptedException {
		
		BooksPage bp=new BooksPage(driver);
		bp.getBooks().click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page not loaded");
		Reporter.log("Books page loaded",true);
	}

}
