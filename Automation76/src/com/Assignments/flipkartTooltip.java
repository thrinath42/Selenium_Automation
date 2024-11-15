package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartTooltip {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			WebElement cart = driver.findElement(By.partialLinkText("Cart"));
			String tool = cart.getAttribute("title");
			System.out.println(tool);
			if(tool.contains("Cart"))
				System.out.println("Tooltip exists");
			else
				System.out.println("Tooltip not exists");
	}

}
