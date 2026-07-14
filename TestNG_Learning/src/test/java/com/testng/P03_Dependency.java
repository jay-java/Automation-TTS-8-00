package com.testng;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class P03_Dependency {

	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create account");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("login");
		assertFalse(true);
	}

	@Test(priority = 3,dependsOnMethods = "login")
	public void profilemanage() {
		System.out.println("profile manage");
	}

}
