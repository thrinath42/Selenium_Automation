package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(id = "gender-male")
	private WebElement genderMale;
	
	@FindBy(id = "FirstName")
	private WebElement firstName;
	
	@FindBy(id = "LastName")
	private WebElement lastName;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id ="ConfirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
}
