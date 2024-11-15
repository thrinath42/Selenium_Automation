package github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program2 {
	public class GitHub {
		
		@Test
		public void addMessage() {
		Reporter.log("Welcome to GitHub again",true);
		Reporter.log("Welcome to GitHub 2nd time",true);
	}
	}

}
