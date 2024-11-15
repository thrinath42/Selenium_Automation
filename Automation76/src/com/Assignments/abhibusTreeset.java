package com.Assignments;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhibusTreeset {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Hyderabad to Bangalore Bus')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='collapsible-indicator col auto']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']")).click();
		List<WebElement> Number = driver.findElements(By.tagName("Strong"));
		
		int count = 0;
		TreeSet<Integer> h = new TreeSet<Integer>();
		for (WebElement no : Number) {
			int num = Integer.parseInt(no.getText().replace(",", ""));
			h.add(num);
			count++;
		}

		System.out.println("Number of Buses= " + count);
		System.out.println("Lowest Price= " + h.first());

	}

}
