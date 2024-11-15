package com.Assignments2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test211024 {

	public static void main(String[] args) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		  
		 
		
		driver.findElement(By.linkText("Vtiger")).click();
		
		Set<String> id = driver.getWindowHandles();
		for(String Id: id) {
			driver.switchTo().window(Id);
			String curUrl = driver.getTitle();
			if(curUrl.contains("CRM Software: Customer Relationship Management | Vtiger CRM"))
			{
				
				break;
			}
		}
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Company')]"))).perform();
		
		driver.findElement(By.partialLinkText("Contact Us")).click();
		WebElement num = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/..//p[contains(@class,'font-size-sm mb-0')]9		"));
		System.out.println(num.getText());
		
		TakesScreenshot ts=(TakesScreenshot) driver; File temp =
				  ts.getScreenshotAs(OutputType.FILE); File dest=new
				  File("./Screenshots/"+time+".png"); FileHandler.copy(temp, dest);

	}

}
