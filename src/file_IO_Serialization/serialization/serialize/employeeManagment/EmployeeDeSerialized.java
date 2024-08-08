package file_IO_Serialization.serialization.serialize.employeeManagment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeSerialized {
    public static void main(String[] args) {
        Employee employee1 = null;
        Employee employee2 = null;
        Employee employee3 = null;

        try(FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream oIn = new ObjectInputStream(fileIn)) {
            employee1 = (Employee) oIn.readObject();
            employee2 = (Employee) oIn.readObject();
            employee3 = (Employee) oIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialized employee...");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}

