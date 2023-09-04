package com.easy;

// wap a program to print fibonassi series of number 10 i.e. 0 1 1 2 3 5 8 13 21 34  
public class FibonassiSeries {

	public static void main(String[] args) {
		int findFibonassiOf = 10;
		int a = 0;
		int b = 1;
		// List list=new ArrayList<>();
		for (int i = 1; i <= findFibonassiOf; i++) {
			System.out.print(a + ", ");
			// list.add(a);
			int c = a + b;
			a = b;
			b = c;
		}
		// System.out.println(list);
	}
}
