package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookLastOpt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropdown);
		List<WebElement> Years = yearSelect.getOptions();
		System.out.println(Years.size());
		System.out.println(Years.getLast().getText());
		System.out.println(Years.getFirst().getText());
		yearSelect.selectByValue(Years.getLast().getText());
		Thread.sleep(3000);
		yearSelect.selectByValue(Years.getFirst().getText());

		for (int i = 0; i < Years.size(); i++) {
			if (i == Years.size() - 1) {
				System.out.println(Years.get(i).getText());
				yearSelect.selectByIndex(i);
			}
		}

	}
}
