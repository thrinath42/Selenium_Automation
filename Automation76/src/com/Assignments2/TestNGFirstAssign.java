package com.Assignments2;

import org.testng.annotations.Test;

public class TestNGFirstAssign {
	@Test(invocationCount = 2)
	public void CreateAccount() {
		System.out.println("Create account");
	}
	@Test()
	public void DeleteAccount() {
		System.out.println("delete account");
	}
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void EditAccount() {
		System.out.println("edit account");
	}

}
