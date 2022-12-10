package com.cloudtech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Petient {
	
	private String name;
	private int age;
	private String disease;
	private int bill;

	public Petient(String name, int age, String disease, int bill) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.bill = bill;
	}

	public Petient() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Petient [name=" + name + ", age=" + age + ", disease=" + disease + ", bill=" + bill + "]";
	}

}

public class CapgeHaspitalScenario {

	public static void main(String[] args) {
		Petient p1 = new Petient("p1", 29, "maleria", 8000);
		Petient p2 = new Petient("p2", 20, "corona", 10000);
		Petient p3 = new Petient("p3", 26, "corona", 7000);
		Petient p4 = new Petient("p4", 23, "corona", 12000);

		List<Petient> petients = Arrays.asList(p1, p2, p3, p4);
		// filtering petients who having corona & whose age below 25
		petients.stream().filter(s -> s.getDisease().equals("corona") && s.getAge() < 25).
		forEach(System.out::println);

		// calculating avg bill for corona petient
		double petientavgbill = petients.stream().filter(s -> s.getDisease().equals("corona"))
				.collect(Collectors.averagingDouble(Petient::getBill));
		System.out.println("average bill paid " + petientavgbill);

	}
}
