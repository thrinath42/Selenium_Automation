package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNg {	//TestNG Class
	@Test
	public void sample() {
		Reporter.log("sample testcase executed",true);
	}
	
	
	@Test
	public void demo() { 	//TESTCASE
		//TEST STEPS
		Reporter.log("Welcome to advance selenium",true);
	}
	
	@Test
	public void add() {
		Reporter.log("add testcase executed",true);
	}
	
	
	/*
	 * Always use small letters for method names,because the traversing path changes
	 * from alphabetical order to ascii. to avoid that scenario go for lowercase
	 */
	 
	

}
