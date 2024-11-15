package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathAxis {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Thrinath/Documents/Selenium%20related/Table.html");
		String collection = driver.findElement(By.xpath("//td[text()='Animal']/preceding-sibling::td")).getText();
		System.out.println(collection);
		String collection1 = driver.findElement(By.xpath("//td[text()='Kalki']/following-sibling::td[1]")).getText();
		System.out.println(collection1);
	}

}
