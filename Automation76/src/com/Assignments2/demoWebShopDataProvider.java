package com.Assignments2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DataProvider.DataStorage;

public class demoWebShopDataProvider {
	@Test(dataProviderClass = DataStorage.class, dataProvider = "LoginDemoWebShop")
	public void login(String[] cred) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "Home Page Not loaded");
		Reporter.log("HP loaded");
	}
	

}
