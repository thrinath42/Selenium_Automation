package com.Assignments2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hardAssert {
@Test
public void launch() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://automationexercise.com/");
	Assert.assertEquals(driver.getTitle(), "Automation Exercise", "Home page not loaded");
	Reporter.log("Hp loaded",true);
	
	driver.findElement(By.partialLinkText("Signup")).click();
	Assert.assertEquals(driver.getTitle(), "Automation Exercise - Signup / Login", "Login page not loaded");
	Reporter.log("Lp loaded",true);
	
	driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("luke240294@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gfdsa123");	
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	String un = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]")).getText();
	Assert.assertEquals(un, "Logged in as luke", "Login name not loaded");
	Reporter.log("Lname displayed",true);
	
	driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]")).click(); 
	Assert.assertEquals(driver.getTitle(), "Automation Exercise - Account Created", "'ACCOUNT DELETED!' is not visible");
	Reporter.log("'ACCOUNT DELETED!' is visible",true);
}
}
