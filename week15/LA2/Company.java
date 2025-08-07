package week15.LA2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Company {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        HashSet<String> departments = new HashSet<>();
        HashMap<String, ArrayList<String>> departmentEmployees = new HashMap<>();

        employees.add(new Employee("Bob", "Engineering"));
        employees.add(new Employee("David", "Engineering"));
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Charlie", "HR"));
        employees.add(new Employee("Eve", "Marketing"));

        for (Employee emp : employees) {
            String dept = emp.getDepartment();
            String name = emp.getName();
            departments.add(dept);
            if (!departmentEmployees.containsKey(dept)) {
                departmentEmployees.put(dept, new ArrayList<>());
            }
            departmentEmployees.get(dept).add(name);
        }

        // Output a list of departments
        System.out.println("Departments: " + departments);
        // Output a list of employees by department
        System.out.println("\nEmployees by Department:");
        for (String department : departmentEmployees.keySet()) {
            System.out.println(department + ": " +
                    departmentEmployees.get(department));
        }
    }
}