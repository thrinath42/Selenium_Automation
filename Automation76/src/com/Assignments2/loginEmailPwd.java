package com.Assignments2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginEmailPwd {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://automationexercise.com/");
			driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
			
			driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]")).sendKeys("luke240294@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Gfdsa123");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			
			WebElement user = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]"));
			if(user.getText().contains("luke"))
				System.out.println("logged in username showed");
			
			driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]")).click();
			if(driver.getCurrentUrl().equals("https://automationexercise.com/delete_account"))
				System.out.println("Account deleted");
			
			
			

	}

}
