package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	//initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//getter
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
}
