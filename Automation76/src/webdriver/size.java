package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		 Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println(height);
		System.out.println(width);
		//System.out.println(size.getHeight());
		//System.out.println(size.getWidth());

	}

}
