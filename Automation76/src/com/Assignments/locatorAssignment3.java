package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorAssignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("luke240294@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("John@2024");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/"))
		System.out.println("Home Page Loaded");
		else
			System.out.println("Home Page not loaded");
}
}
