package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("7670812500");//for name:value pairs
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();//for text data
		driver.navigate().back();
		

	}

}
