package TestNgAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	public void launchbrowser(@Optional("chrome") String browser) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}
