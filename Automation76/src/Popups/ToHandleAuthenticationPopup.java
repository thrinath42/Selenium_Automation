package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAuthenticationPopup {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
							  //username:pwd@//	
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
