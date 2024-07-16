package controlFlow.loops.forLoop.employeeSalaryReport;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalaryReport {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Mohammad Rafique", 60000));
        employees.add(new Employee(102, "Mohammad Ashraful Islam", 65000));
        employees.add(new Employee(103, "Habibul Bashar", 50000));
        employees.add(new Employee(104, "Syad Rasel", 45000));
        employees.add(new Employee(105, "Jabed Omar", 40000));

        double totalSalary = 0;

        for ( Employee employee : employees) {
            totalSalary += employee.getSalary();
            System.out.println(employee);
        }
        System.out.println("Total Salary Expense: " + totalSalary);
    }
}
