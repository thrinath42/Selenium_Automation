package TestNgAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics {
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement electronics;
	
	public Electronics(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getElectronics() {
		return electronics;
	}
	
	

}
