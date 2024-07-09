package arrays.studentGradingSystem;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int numberOfGrades) {
        this.name = name;
        this.grades = new int[numberOfGrades];
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int index, int grade) {
        if (index >= 0 && index < grades.length) {
            grades[index] = grade;
        } else {
            System.out.println("Invalid grade index.");
        }
    }

    public double averageGrade() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length;
    }

    public void displayStudentDetails() {
        System.out.print("Name: " + name + "\tGrades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.printf("Average: %.2f\n", averageGrade());
    }

}
