package TestNgAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers {
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computer;
	
	public Computers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getComputer() {
		return computer;
	}
	
	

}
