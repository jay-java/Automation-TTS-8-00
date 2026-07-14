package com.testng;

import org.testng.annotations.Test;

public class P02_Priority {

	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create account");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 3)
	public void profilemanage() {
		System.out.println("profile manage");
	}

	@Test(priority = 4)
	public void changePassword() {
		System.out.println("change password");
	}

	@Test(priority = 5)
	public void logout() {
		System.out.println("logout");
	}

	@Test(priority = 6)
	public void forgotPassword() {
		System.out.println("forgot password");
	}
}
