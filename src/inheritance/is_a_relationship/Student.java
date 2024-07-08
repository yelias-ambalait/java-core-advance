package inheritance.is_a_relationship;

public class Student extends Member{

    private String studentId;
    private String course;
    public Student(String memberId, String memberName, String memberEmail, String studentId, String course) {
        super(memberId, memberName, memberEmail);
        this.studentId = studentId;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
