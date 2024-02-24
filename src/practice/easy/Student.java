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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		return true;
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