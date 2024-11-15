package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRallyPage {

	@FindBy(id = "navbar-search-input")
	private WebElement searchTextField;
	
	public SkillRallyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	
	
}
