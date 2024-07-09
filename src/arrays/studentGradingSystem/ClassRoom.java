package arrays.studentGradingSystem;

public class ClassRoom {
    private Student[] students;
    private int studentCount;

    public ClassRoom(int capacity) {
        this.students = new Student[capacity];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {

        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Class is full");
        }
    }

    public void updateStudentGrade(String name, int index, int grade ) {
        for(int i=0; i<studentCount; i++) {
            if(students[i].getName().equals(name)) {
                students[i].setGrades(index, grade);
                return;
            }
        }
        System.out.println("Student is not found");
    }

    public void displayAllStudents() {
        for(int i=0; i<studentCount; i++) {
            students[i].displayStudentDetails();
        }
    }
}