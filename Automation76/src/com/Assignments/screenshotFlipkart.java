package com.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotFlipkart {

	public static void main(String[] args) throws IOException {
		String time = LocalTime.now().toString().replace(":", "-");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			if(driver.getCurrentUrl().equals("https://www.flipkart.com/"))
				System.out.println("Flipkart Loaded successfully");
			else
				System.out.println("Flipkart not loaded");
			driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("Mobiles",Keys.ENTER);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshots/"+time+".png");
			FileHandler.copy(temp, dest);
			

	}

}
