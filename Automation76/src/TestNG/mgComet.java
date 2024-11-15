package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mgComet {

	@Test(groups = "smoke")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.mgmotor.co.in/vehicles/comet-ev-electric-car-in-india/digital-kmi?ecid=pse:EV:Comet:brand:sov:AO&ef_id=CjwKCAjwjsi4BhB5EiwAFAL0YLE6J54JAvP5iZP1xWfLXLW1e-1FC9sDOG_onOuwiW9SpDAGZcm9dxoCnUwQAvD_BwE:G:s&s_kwcid=AL!8805!3!689896313237!e!!g!!mg%20comet&gad_source=1&gclid=CjwKCAjwjsi4BhB5EiwAFAL0YLE6J54JAvP5iZP1xWfLXLW1e-1FC9sDOG_onOuwiW9SpDAGZcm9dxoCnUwQAvD_BwE");
		Reporter.log("COmet launched");
	}
}
