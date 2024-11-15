package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cofigurationAnnotations {
		@BeforeSuite
		public void beforeSuite() {
			Reporter.log("@beforesuite",true);
		}
		
		@BeforeTest
		public void beforeTest() {
			Reporter.log("@BeforeTest",true);
		}
		
		@BeforeClass
		public void beforeClass() {
			Reporter.log("@Beforeclass",true);
		}
		
		@BeforeMethod
		public void beforeMethod() {
			Reporter.log("@beforemethod",true);
		}
		
		@Test
		public void demo() {
			Reporter.log("@test demo test case executed",true);
		}
		
		@Test
		public void sample() {
			Reporter.log("Test Sample",true);
		}
		
		@AfterMethod
		public void afterMethod() {
			Reporter.log("@aftermethod",true);
		}
		@AfterClass
		public void afterClass() {
			Reporter.log("@afterClass",true);
		}
		
		@AfterTest
		public void AfterTest() {
			Reporter.log("@AfterTest",true);
		}
		@AfterSuite
		public void afterSuite() {
			Reporter.log("After Suite",true);
		}
}
