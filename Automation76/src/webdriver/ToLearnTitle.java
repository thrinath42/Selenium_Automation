//program for gettitle and checking it
package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More"))
			System.out.println("successfully loaded");
		else
			System.out.println("NoT successfully loaded");
		
	}

}
