package wrapperClass.employeeManagementSystem;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private Boolean isActive;

    public Employee(Integer id, String name, Double salary, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID: "+id+
                "\tName: "+name+
                "\tSalary: "+salary+
                "\tisActive: "+isActive+
                "}";
    }
}
