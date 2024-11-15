package com.Assignments2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkillRallyExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			FileInputStream fis=new FileInputStream("./testdata/TestScriptData.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			String url = workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
			System.out.println(url);
			String fna = workbook.getSheet("Sheet1").getRow(2).getCell(7).getStringCellValue();	
			System.out.println(fna);
			String lna = workbook.getSheet("Sheet1").getRow(2).getCell(8).getStringCellValue();
			System.out.println(lna);
			String email = workbook.getSheet("Sheet1").getRow(2).getCell(9).getStringCellValue();
			System.out.println(email);
			String pwd = workbook.getSheet("Sheet1").getRow(2).getCell(10).getStringCellValue();
			System.out.println(pwd);
			String rpwd = workbook.getSheet("Sheet1").getRow(2).getCell(11).getStringCellValue();
			System.out.println(rpwd);	
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			
			driver.get(url);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fna);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lna);
			driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(email);
			driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@name='repassword']")).sendKeys(rpwd);
		//	Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='btnRegister']")).click();
	}

}
