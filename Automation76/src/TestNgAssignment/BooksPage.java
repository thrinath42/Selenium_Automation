package TestNgAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	@FindBy(partialLinkText = "Books")
	private WebElement books;
	
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBooks() {
		return books;
	}
	
	
}
