package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ducatiscrambler {
	@Test(groups = {"smoke","functionality"})
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.scramblerducati.com/en/bikes/icon-dark/?_gl=1*s2ackv*_ga*MjI2Nzk4NDI5LjE3MjkyMzc1OTg.*_ga_8W811JZPVD*MTcyOTIzNzU5Ny4xLjAuMTcyOTIzNzYwMS4wLjAuMA..");
		Reporter.log("Scrambler launched");
	}

}
