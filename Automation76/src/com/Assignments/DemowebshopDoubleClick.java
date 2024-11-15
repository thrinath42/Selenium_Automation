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

public class DemowebshopDoubleClick {

	public static void main(String[] args) throws IOException {
			String time = LocalDateTime.now().toString().replace(":", "-");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
			driver.findElement(By.linkText("Double Click")).click();
			Actions act=new Actions(driver);
			act.doubleClick(driver.findElement(By.xpath("(//button[text()='Yes'])[1]"))).perform();
			TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshots/"+time+".png");
			FileHandler.copy(temp, dest);
			
			

	}

}
