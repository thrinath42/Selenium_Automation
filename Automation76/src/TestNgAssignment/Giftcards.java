package TestNgAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcards {
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement gift;
	
	public Giftcards(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getGift() {
		return gift;
	}
	
	
}
