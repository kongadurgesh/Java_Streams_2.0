package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    private int yearsOfExperience;
    private String role;

    // Constructor
    public Employee(int id, String name, int age, String department, double salary, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.id = id;
    }

    public Employee(int id, String name, String role, String department, double salary, int yearsOfExperience,
            int age) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.id = id;
        this.role = role;
    }

    public Employee(int id, String name, int age, double salary, String department,
            String role, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.id = id;
        this.role = role;
    }

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", salary="
                + salary + ", yearsOfExperience=" + yearsOfExperience + ", role=" + role + "]";
    }

    public static List<Employee> generateEmployees(int count) {
        List<Employee> employees = new ArrayList<>();
        String[] departments = { "HR", "Engineering", "Marketing", "Sales" };
        String[] names = { "John", "Jane", "Alex", "Michael", "Sarah", "Emily", "David", "Chris", "Katie", "James" };

        for (int i = 0; i < count; i++) {
            String name = names[ThreadLocalRandom.current().nextInt(names.length)] + "_" + i;
            double salary = ThreadLocalRandom.current().nextDouble(30000, 120000);
            String department = departments[ThreadLocalRandom.current().nextInt(departments.length)];
            employees.add(new Employee(name, salary, department));
        }

        return employees;
    }

    public static List<Employee> populateEmployees() {
        return Arrays.asList(
                new Employee(1, "Alice", 29, 75000, "Engineering", "Developer", 5),
                new Employee(2, "Bob", 35, 85000, "Engineering", "Lead Developer", 8),
                new Employee(3, "Charlie", 40, 95000, "HR", "HR Manager", 10),
                new Employee(4, "David", 30, 85000, "Engineering", "Developer", 6),
                new Employee(5, "Eva", 26, 70000, "Engineering", "Junior Developer", 3),
                new Employee(6, "Frank", 38, 95000, "Sales", "Sales Manager", 12),
                new Employee(7, "Grace", 29, 78000, "HR", "HR Assistant", 4),
                new Employee(8, "Hannah", 45, 90000, "Engineering", "Senior Developer", 12),
                new Employee(9, "Ivy", 33, 77000, "Engineering", "Developer", 7),
                new Employee(10, "John", 31, 71000, "Engineering", "Developer", 4));

    }

}
