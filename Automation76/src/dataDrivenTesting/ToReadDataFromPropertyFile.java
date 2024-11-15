package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// step1:- create object for FileInputStream
		FileInputStream fis=new FileInputStream("./testdata/demoSkill.properties");
		
		//step2:- create respective file type object
		Properties prop=new Properties();		
		
		//step3:- call read methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String mail = prop.getProperty("email");
		String pwd = prop.getProperty("password");
		
		System.out.println(url);
		System.out.println(mail);
		System.out.println(pwd);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.id("password")).sendKeys(pwd);
}

}
