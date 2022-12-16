package com.edureka;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertDemo {

	@Test
	public void test() {
		String str = new String("edu");
		String str1 = new String("edu");
		String str3 = null;
		String str4 = "edu";
		String str5 = "edu";
		int a = 5;
		int b = 6;
		String[] exceptedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };
		assertEquals(str, str1);
		// check true
		assertTrue(a < b);
		assertFalse(a > b);
		// check for null condition
		assertNull(str3);
		// check of the reference is to same program
		assertSame(str4, str5);
		//not same
		assertNotSame(str, str1);
		assertArrayEquals(exceptedArray, resultArray);
	}
}
