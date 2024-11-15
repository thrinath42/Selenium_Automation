
package com.Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height=" + size.getHeight());
		System.out.println("Width=" +size.getWidth());
		Thread.sleep(5000);
		driver.close();
	}

}
