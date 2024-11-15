package com.Assignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().fullscreen();
		Point position = driver.manage().window().getPosition();
		System.out.println("X axis =" + position.getX());
		System.out.println("Y axis =" + position.getY());
		Thread.sleep(5000);
		driver.quit();
	}

}
