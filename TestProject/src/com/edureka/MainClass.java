package com.edureka;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainClass {

	public static void main(String[] args) { //test using main class output on console
		Result result=JUnitCore.runClasses(JunitClass.class);
		
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("results "+result.wasSuccessful());
	}
}
