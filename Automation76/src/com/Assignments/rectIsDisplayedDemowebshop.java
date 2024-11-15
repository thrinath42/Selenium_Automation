package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rectIsDisplayedDemowebshop {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			WebElement subscribe = driver.findElement(By.xpath("//input[@value='Subscribe']"));
			System.out.println(subscribe.isDisplayed());
			System.out.println("Height= "+subscribe.getRect().getHeight());
			System.out.println("Width= "+ subscribe.getRect().getWidth());
			System.out.println("X-axis= "+ subscribe.getRect().getX());
			System.out.println("Y-axis= "+ subscribe.getRect().getY());

	}

}
