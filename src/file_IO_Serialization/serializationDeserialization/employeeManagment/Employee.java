package file_IO_Serialization.serializationDeserialization.employeeManagment;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String department;
    private transient String personalNumber;
    public Employee(int id, String name, String department, String personalNumber) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                '}';
    }
}
