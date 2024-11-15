package TestNG;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void register() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.fail();     //to stop execution at this line itself
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register is successfull",true);
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login is successfull",true);
	}
	
	@Test(dependsOnMethods = {"register","login"})
	public void addTOCart() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/cart");
		Reporter.log("product added to cart",true);
		
	}
}
