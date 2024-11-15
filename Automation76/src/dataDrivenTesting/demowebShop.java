package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebShop {

	public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String url = prop.getProperty("url");
			String mail = prop.getProperty("email");
			String pwd = prop.getProperty("password");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get(url);
			driver.findElement(By.partialLinkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(mail);
			driver.findElement(By.id("Password")).sendKeys(pwd);
			
			

	}

}
