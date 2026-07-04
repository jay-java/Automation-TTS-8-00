package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.BeforeParam;

public class P004_Annotations {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@Before
	public void beforeMethod() {
		System.out.println("before method");
	}

	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		System.out.println("test 2");
	}

	@After
	public void afterMethod() {
		System.out.println("after method");
	}

	@AfterClass
	public static void afterClas() {
		System.out.println("after class");
	}

}
