package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabledSkillrally {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
			System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[2]")).isEnabled());

	}

}
