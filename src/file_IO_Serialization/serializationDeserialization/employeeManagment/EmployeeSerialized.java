package file_IO_Serialization.serializationDeserialization.employeeManagment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialized {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Adam Smith", "Accounts", "333-4896-3258");
        Employee employee2 = new Employee(2, "Adam Tony", "Intelligence", "444-4896-3258");
        Employee employee3 = new Employee(3, "John Wick", "Information Technology", "555-4896-3258");

        try(FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(employee1);
            out.writeObject(employee2);
            out.writeObject(employee3);
            System.out.println("Serialized data saved in the employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
