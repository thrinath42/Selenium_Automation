package shadowElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClosedShadowRoot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		Thread.sleep(2000);
		//for closed shadow root we cannot use getshadowroot(),so using this alternate root
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys("Thrinath").perform();
		action.sendKeys(Keys.TAB).sendKeys("123456").perform();

	}

}
