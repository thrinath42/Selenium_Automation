package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public Workbook workbook;
	
	
	@BeforeTest
	public void fetchdata() throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		prop=new Properties();
		prop.load(fis);
		
		FileInputStream efis=new FileInputStream("./testdata/TestScriptData.xlsx");
		workbook=WorkbookFactory.create(efis);
	}
	
	@AfterTest
	public void closeObject() throws IOException {
		workbook.close();
	}
	@Parameters("Browser")
	@BeforeClass
		public void launchBrowser(@Optional("chrome") String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if (browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(prop.getProperty("url"));
	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));;
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();		
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();	
	}

}
