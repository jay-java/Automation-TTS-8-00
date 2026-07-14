package com.testng;

import org.testng.annotations.Test;

public class P04_Exception {

	@Test
	public void test1() {
		System.out.println("test 1 method");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void test2() {
		int i = 10 / 0;
		System.out.println("test 2 method");

	}

	@Test
	public void test3() {
		System.out.println("test 3 method");
	}

}
