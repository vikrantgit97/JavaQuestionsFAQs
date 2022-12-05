package com.test;

// wap a program to print fibonassi series of number 10 i.e. 0 1 1 2 3 5 8 13 21 34  
public class FibonassiSeries {

	public static void CountWordsFromString(int str) {
		int a = 0;
		int b = 1;
		for (int i = 1; i <= str; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		CountWordsFromString(10);
	}
}
