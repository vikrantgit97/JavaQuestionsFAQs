package com.edureka;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JunitClass {
	@Test
	public void setup() {
		String str="hello";
		assertEquals("hell", str);
	}
}
