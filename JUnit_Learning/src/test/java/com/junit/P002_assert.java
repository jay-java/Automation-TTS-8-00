package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P002_assert {

	@Test
	public void test1() {
		System.out.println("test 1 method");
		int expected = 20;
		int actual = 10;
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4, 5 };
		assertEquals(a, b);
	}
}
