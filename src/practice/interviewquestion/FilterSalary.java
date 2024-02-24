package practice.interviewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vikrant on 25-11-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */

// Q. filter employee salary greater than 10000
public class FilterSalary {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 12000.0,"EE"));
        employees.add(new Employee(2, "Jane", 8000.0,"HR"));
        employees.add(new Employee(3, "Bob", 15000.0,"EE"));
        employees.add(new Employee(5, "Alice", 9500.0,"ME"));
        employees.add(new Employee(6, "Alice", 9500.0,"ME"));
        employees.add(new Employee(7, "Alice", 9500.0,"EE"));
        employees.add(new Employee(8, "Alice", 9500.0,"ME"));
        employees.add(new Employee(9, "Alice", 9500.0,"HR"));
        employees.add(new Employee(10, "Alice", 9500.0,"HR"));

        // filter employee salary greater than 10000
        List<Employee> filteredEmployees = employees
        .stream()
        .filter(e -> e.getSalary() > 10000)
        .collect(Collectors.toList());

        filteredEmployees.forEach(employee ->
                System.out.println("ID: " + employee.getId() +
                        ", Name: " + employee.getName() +
                        ", Salary: " + employee.getSalary()));
    }
}

class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }

    
}