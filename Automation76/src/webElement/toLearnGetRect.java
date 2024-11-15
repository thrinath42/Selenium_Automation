package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnGetRect {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Rectangle rect = driver.findElement(By.id("small-searchterms")).getRect();
			System.out.println("Height= "+ rect.getHeight());
			System.out.println("width= " + rect.getWidth());
			System.out.println("X-axis= " + rect.getX());
			System.out.println("Y-axis= "+ rect.getY());

	}

}
