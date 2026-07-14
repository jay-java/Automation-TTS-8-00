package com.testng;

import org.testng.annotations.Test;

public class P01_First {

	@Test
	public void test1() {
		System.out.println("test 1 method");
	}

	@Test
	public void test2() {
		System.out.println("test 2 method");
	}

	@Test(enabled = false)
	public void test3() {
		System.out.println("test 3 method");
	}
}
