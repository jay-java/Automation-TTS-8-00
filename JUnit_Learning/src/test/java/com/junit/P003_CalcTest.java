package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P003_CalcTest {

	@Test
	public void addTest() {

		Calc c = new Calc();
		int actual = c.add(12, 12);
		int expected = 25;
		assertEquals(expected, actual);
	}
}
