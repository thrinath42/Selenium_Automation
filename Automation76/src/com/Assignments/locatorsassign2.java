package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsassign2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("luke240294@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("John@2024");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/"))
		
			System.out.println("Home page loaded");
		
		else
			System.out.println("Home page not loaded");

	}

}
