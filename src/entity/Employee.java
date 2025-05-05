package entity;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;
    private int yearsOfExperience;

    // Constructor
    public Employee(String name, int age, String department, double salary, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
        return name + " (" + age + ", " + department + ", ₹" + salary + ", " + yearsOfExperience + " yrs)";
    }
}
