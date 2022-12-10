package com.test;

interface Test {
	void m1();

	void m2();
}

public class AnnonymusDemo {

	public static void main(String[] args) {
		Test t = new Test() {

			@Override
			public void m2() {
				System.out.println("this is m1 method");
			}

			@Override
			public void m1() {
				System.out.println("this is m2 method ");
			}
		};
		t.m1();
		t.m2();
	}
}
