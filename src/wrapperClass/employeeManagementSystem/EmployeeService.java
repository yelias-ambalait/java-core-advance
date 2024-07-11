package wrapperClass.employeeManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
    List<Employee> employeeList;
    Map<Integer, Employee> employeeMap;

    public EmployeeService() {
        this.employeeList = new ArrayList<>();
        this.employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        employeeMap.put(employee.getId(), employee);
    }

    public Employee getEmployeeById(Integer id) {
        return employeeMap.get(id);
    }

    public void displayAllEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}
