package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JnitTesting tesst = new JnitTesting();
		// int output = tesst.square(2);
		int output = tesst.countA("raja");
		assertEquals(2, output);
	}
} 
