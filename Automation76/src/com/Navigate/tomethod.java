package com.Navigate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tomethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.navigate().to("https://drop.com/home");
		driver.navigate().to(new URL("https://www.myntra.com"));

	}

}
