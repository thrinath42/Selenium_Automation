package com.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demoAppsScreenshot {

	public static void main(String[] args) throws IOException {
		String time = LocalTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='Experience the seamless interactions and responsive designs']"))
				.click();
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();

		if (driver.getCurrentUrl().contains("https://demoapps.qspiders.com/ui/table/dynamicTable"))
			System.out.println("Dynamic Table loaded");
		else
			System.out.println("Not Loaded");
		WebElement price = driver.findElement(By.xpath("(//td[contains(@class,'px-6 py-4 font-bold text-black')])[3]"));
		String str = price.getText();

		System.out.println(str);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + time + ".png");
		FileHandler.copy(temp, dest);

	}

}
