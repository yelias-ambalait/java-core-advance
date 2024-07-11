package wrapperClass.employeeManagementSystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        Employee emp1 = new Employee(101, "Smith", 55000.00, true);
        Employee emp2 = new Employee(102, "Lorem", 15500.00, true);
        Employee emp3 = new Employee(103, "Hola", 40000.00, null);
        Employee emp4 = new Employee(104, "Ken", 45000.00, true);
        Employee emp5 = new Employee(105, "Naomi", 63000.00, true);

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);
        employeeService.addEmployee(emp3);
        employeeService.addEmployee(emp4);
        employeeService.addEmployee(emp5);

        employeeService.displayAllEmployees();
        System.out.println(employeeService.getEmployeeById(105));
    }
}
