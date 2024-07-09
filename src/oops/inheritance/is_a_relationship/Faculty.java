package oops.inheritance.is_a_relationship;

public class Faculty extends Member{

    private String facultyId;
    private String department;
    public Faculty(String memberId, String memberName, String memberEmail, String facultyId, String department) {
        super(memberId, memberName, memberEmail);
        this.facultyId = facultyId;
        this.department = department;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
