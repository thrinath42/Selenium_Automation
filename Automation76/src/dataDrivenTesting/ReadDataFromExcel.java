package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1: create fis obiect
		FileInputStream fis=new FileInputStream("./testdata/TestScriptData.xlsx");
		
		//step2: create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step3: call read methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String un = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(un);
		
		String pwd = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(pwd);
		
		double price = workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(price);
		double priceint = workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(priceint);
		
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(status);
		
		
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println(date);
		
		int dat = date.getDayOfMonth();
		Month month = date.getMonth();
		int year = date.getYear();
		
		System.out.println(dat);
		System.out.println(month);
		System.out.println(year);
		
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);	*/

	}

}
