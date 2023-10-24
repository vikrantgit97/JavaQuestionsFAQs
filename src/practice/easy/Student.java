package practice.easy;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	String name;
	String city;
	int id;

	public Student(String name, String city, int id) {
		this.name = name;
		this.city = city;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student >>  name:" + name + ", city:" + city + ", id:" + id + "  ";
	}

	public int compareTo(Student a) {
		if (id == a.id)			
			return 0;
		if (id > a.id) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("sagar", "raver", 2));
		al.add(new Student("vikrant", "takali", 5));
		al.add(new Student("amruta", "solapur", 1));
		
		Collections.sort(al);
		for (Student s : al) {
			System.out.println(s);
		}
	}
}