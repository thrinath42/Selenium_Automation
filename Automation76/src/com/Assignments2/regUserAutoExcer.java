package com.Assignments2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class regUserAutoExcer {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/SignUp.properties");
		Properties prop	= new Properties();
		prop.load(fis);

		String url = prop.getProperty("url");
		String name = prop.getProperty("name");
		String email = prop.getProperty("email");
		String pwd = prop.getProperty("password");
		String dy = prop.getProperty("day");
		String month = prop.getProperty("month");
		String yr = prop.getProperty("year");
		String fn = prop.getProperty("firstname");
		String ln = prop.getProperty("lastname");
		String company = prop.getProperty("company");
		String add1 = prop.getProperty("add1");
		String add2 = prop.getProperty("add2");
		String country = prop.getProperty("country");
		String state = prop.getProperty("state");
		String city = prop.getProperty("city");
		String zip = prop.getProperty("zip");
		String mobile = prop.getProperty("mobile");




		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get(url);
		if(driver.getCurrentUrl().equals("https://automationexercise.com/"))
			System.out.println("Home Page Loaded");

		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		if(driver.getTitle().contains("Signup / Login"))
			System.out.println("Signup loaded");

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys(email);
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		driver.findElement(By.xpath("(//input[@name='title'])[1]")).click();
		driver.findElement(By.id("password")).sendKeys(pwd);

		Select day=new Select(driver.findElement(By.id("days")));
		day.selectByValue(dy);

		Select mon=new Select(driver.findElement(By.id("months")));
		mon.selectByValue(month);

		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue(yr);

		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();

		driver.findElement(By.id("first_name")).sendKeys(fn);
		driver.findElement(By.id("last_name")).sendKeys(ln);
		driver.findElement(By.id("company")).sendKeys(company);
		driver.findElement(By.id("address1")).sendKeys(add1);
		driver.findElement(By.id("address2")).sendKeys(add2);
		Select cty=new Select(driver.findElement(By.id("country")));
		cty.selectByValue(country);
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zipcode")).sendKeys(zip);
		driver.findElement(By.id("mobile_number")).sendKeys(mobile);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		if(driver.getCurrentUrl().equals("https://automationexercise.com/account_created"))
			System.out.println("Account Created");

		driver.findElement(By.partialLinkText("Continue")).click();
		WebElement user = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]"));
		if(user.getText().contains("luke"))
			System.out.println("logged in username showed");

		
		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]")).click(
		 * ); if(driver.getCurrentUrl().equals(
		 * "https://automationexercise.com/delete_account"))
		 * System.out.println("Account deleted");
		 */
		 	
	}

}
