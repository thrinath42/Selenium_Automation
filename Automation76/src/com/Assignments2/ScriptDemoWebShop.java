package com.Assignments2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.RegisterPage;
import POM.WelcomePage;

public class ScriptDemoWebShop {

	public static void main(String[] args) throws IOException, InterruptedException {
			
			FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String url = prop.getProperty("url");
			
			FileInputStream fiss=new FileInputStream("./testdata/TestScriptData.xlsx");
			Workbook workbook = WorkbookFactory.create(fiss);
			String fn = workbook.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
			String ln = workbook.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
			String email = workbook.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
			String pwd = workbook.getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();
			String rpwd = workbook.getSheet("Sheet2").getRow(1).getCell(4).getStringCellValue();
								
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			Thread.sleep(3000);
			
			WelcomePage wp=new WelcomePage(driver);
			wp.getRegisterLink().click();
			
			RegisterPage rp=new RegisterPage(driver);
			rp.getGenderMale().click();
			rp.getFirstName().sendKeys(fn);
			rp.getLastName().sendKeys(ln);
			rp.getEmail().sendKeys(email);
			rp.getPassword().sendKeys(pwd);
			rp.getConfirmPassword().sendKeys(rpwd);
			rp.getRegisterButton().click();
			
			if(driver.getTitle().contains("Demo Web Shop. Register"));
			System.out.println("Registeration Successful");
	}

}
