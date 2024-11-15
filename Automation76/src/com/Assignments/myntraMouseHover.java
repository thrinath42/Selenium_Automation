package com.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class myntraMouseHover {

	public static void main(String[] args) throws InterruptedException, IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		act.moveByOffset(348, 52).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText("Ethnic Wear"))).click().perform();
		if(driver.getCurrentUrl().equals("https://www.myntra.com/ki-etnhc?f=Gender%3Aboys%2Cboys%20girls&plaEnabled=false"))
		{
			System.out.println("page loaded");
		}
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);

	}

}
