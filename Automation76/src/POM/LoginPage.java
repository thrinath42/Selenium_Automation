package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(linkText = "Log in")
	private WebElement logIn;
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(name = "Password")
	private WebElement passwordTextField;
	
	@FindBy(linkText = "Log in")
	private WebElement loginButton;
	
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//getter
	
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	

	

}
