package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P006_Exception {

	@Test(expected = ArithmeticException.class)
	public void test1() {
		int i = 10 / 0;
		System.out.println("test 1 : " + i);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("test 2 : " + a[10]);
	}
}
