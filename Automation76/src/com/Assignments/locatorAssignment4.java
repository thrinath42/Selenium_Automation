package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorAssignment4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();
		List<WebElement> head = driver.findElements(By.tagName("span"));
		for(WebElement Head: head)
		{
			System.out.println(Head.getText());
		}
	}
	

}
