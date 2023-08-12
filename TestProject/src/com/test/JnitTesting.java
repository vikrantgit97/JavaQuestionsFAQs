package com.test;

public class JnitTesting {

	public int square(int u) {
		return u*u;
	}
	
	public int countA(String word) {
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='A')
				count++;
		}
		return count;
	}
}
