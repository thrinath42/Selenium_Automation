package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsassignmnet1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapp.skillrary.com/");
		driver.findElement(By.partialLinkText("SIGNUP")).click();
		String currenturl = driver.getCurrentUrl();
		if(currenturl.equals(currenturl))
		{
			System.out.println("inside if");
			driver.findElement(By.name("firstname")).sendKeys("Thrinath");
			driver.findElement(By.name("lastname")).sendKeys("T");
			driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("luke240294@gmail.com");
			driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("John@2024");
			driver.findElement(By.xpath("(//input[@name='repassword'])[1]")).sendKeys("John@2024");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='signup']")).click();
		}
		else
		{
			System.out.println("page not loaded properly");
		}

	}

}
