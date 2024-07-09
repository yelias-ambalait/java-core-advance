package arrays.studentGradingSystem;

public class Main {
    public static void main(String[] args) {
        ClassRoom classroom = new ClassRoom(3);

        Student student1 = new Student("Abdullah", 3);
        Student student2 = new Student("Amatullah", 3);
        Student student3 = new Student("Aminullah", 3);

        student1.setGrades(0, 95);
        student1.setGrades(1, 85);
        student1.setGrades(2, 75);

        student2.setGrades(0, 78);
        student2.setGrades(1, 87);
        student2.setGrades(2, 95);

        student3.setGrades(0, 88);
        student3.setGrades(1, 97);
        student3.setGrades(2, 77);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

//        classroom.updateStudentGrade("Abdullah", 0, 85);
//        classroom.updateStudentGrade("Abdullah", 1, 80);
//        classroom.updateStudentGrade("Abdullah", 2, 95);
//
//        classroom.updateStudentGrade("Amatullah", 0, 78);
//        classroom.updateStudentGrade("Amatullah", 1, 90);
//        classroom.updateStudentGrade("Amatullah", 2, 75);
//
//        classroom.updateStudentGrade("Aminullah", 0, 87);
//        classroom.updateStudentGrade("Aminullah", 1, 79);
//        classroom.updateStudentGrade("Aminullah", 2, 85);

        classroom.displayAllStudents();
    }
}
