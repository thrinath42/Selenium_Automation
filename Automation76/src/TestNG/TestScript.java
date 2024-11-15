package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	@Test
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		String act = driver.getTitle();
		
		if(act.equals(workbook.getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue()))
			Reporter.log("Books page dispalyed",true);
		else
			Reporter.log("not displayed",true);
	}

}

