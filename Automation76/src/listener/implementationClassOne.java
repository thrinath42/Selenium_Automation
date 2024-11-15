package listener;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class implementationClassOne extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();
		String tstamp = LocalDateTime.now().toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+methodName+tstamp+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
