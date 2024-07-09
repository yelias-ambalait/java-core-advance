package oops.inheritance.has_a_relationship;

import oops.inheritance.is_a_relationship.Faculty;
import oops.inheritance.is_a_relationship.Student;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("101", "Java Programming", "Author A");
        Book book2 = new Book("102", "C Programming", "Author B");

        library.addBook(book1);
        library.addBook(book2);

        for(Book book : library.getBooks()){
            System.out.println("Book ID: "+book.getBookId()+" ,Book Title: "+book.getBookTitle()+ " ,Author: "+book.getAuthor());
        }

        Student student = new Student("m01", "Jamrul Huda", "jhuda@hotmail.com", "s01", "Computer Science");
        Faculty faculty = new Faculty("fm01", "Mahbubul Huda", "mhuda@hotmail.com", "fid01", "Mathematics");

        System.out.println("Student Name: "+student.getMemberName()+" ,Course: "+student.getCourse());
        System.out.println("Faculty Name: "+faculty.getMemberName()+" ,Department: "+faculty.getDepartment());

    }
}
