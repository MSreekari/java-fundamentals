package Collections;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // toString() for printing
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Program3 {
    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        // Add Employees
        empList.add(new Employee(101, "Anu", 50000));
        empList.add(new Employee(102, "Ravi", 70000));
        empList.add(new Employee(103, "Kiran", 60000));
        empList.add(new Employee(104, "Bala", 45000));

        Collections.sort(empList, new SortByName());

        System.out.println("Sorted by Name:");
        for (Employee e : empList) {
            System.out.println(e);
        }

        Collections.sort(empList, new SortBySalary());

        System.out.println("\nSorted by Salary:");
        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}
