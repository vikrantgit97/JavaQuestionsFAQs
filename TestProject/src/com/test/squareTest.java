package com.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class squareTest {

	@Test
	public void test() {
		JnitTesting test = new JnitTesting();
		int output = test.square(2);
		//int output=tesst.countString("vedant");
		assertEquals(4, output);
	}
}
