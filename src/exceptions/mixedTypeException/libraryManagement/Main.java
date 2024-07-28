package exceptions.mixedTypeException.libraryManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book isbn and book name: ");
        String isbn = scanner.next();
        String bookName = scanner.nextLine();
        library.addBook(isbn, bookName);

        System.out.println("Enter userId and username: ");
        String userId = scanner.next();
        String username = scanner.nextLine();
        library.addUser(userId, username);

        try {
            library.borrowBook(isbn, userId);
            library.returnBook("2B539", "0U01");

            library.borrowBook("2B522", "0U01");
        } catch (BookNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (BookAlreadyBorrowedException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (BookAlreadyReturnedException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Borrow return completed.");
        }

    }
}
