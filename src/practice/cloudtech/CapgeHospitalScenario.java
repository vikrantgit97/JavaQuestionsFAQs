package practice.cloudtech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Patient {
	
	private String name;
	private int age;
	private String disease;
	private int bill;

	public Patient(String name, int age, String disease, int bill) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.bill = bill;
	}

	public Patient() {
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
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ", bill=" + bill + "]";
	}

}

public class CapgeHospitalScenario {

	public static void main(String[] args) {
		Patient p1 = new Patient("p1", 29, "malaria", 8000);
		Patient p2 = new Patient("p2", 20, "corona", 10000);
		Patient p3 = new Patient("p3", 26, "corona", 7000);
		Patient p4 = new Patient("p4", 23, "corona", 12000);

		List<Patient> patients = Arrays.asList(p1, p2, p3, p4);
		// filtering patients who having corona & whose age below 25
		patients.stream().filter(s -> s.getDisease().equals("corona") && s.getAge() < 25).
		forEach(System.out::println);

		// calculating avg bill for corona patient
		double patientAvgBill = patients.stream().filter(s -> s.getDisease().equals("corona"))
				.collect(Collectors.averagingDouble(Patient::getBill));
		System.out.println("average bill paid " + patientAvgBill);

	}
}
