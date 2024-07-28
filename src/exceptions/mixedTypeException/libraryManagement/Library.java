package exceptions.mixedTypeException.libraryManagement;

import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<String, Book> books = new HashMap<String, Book>();
    Map<String, User> users = new HashMap<String, User>();

    public void addBook(String isbn, String title) {
        books.put(isbn, new Book(isbn, title));
    }
    public void addUser(String userId, String userName) {
        users.put(userId, new User(userId, userName));
    }

    public void borrowBook(String isbn, String userId) throws BookAlreadyBorrowedException, BookNotFoundException {
        Book book = findBook(isbn);
        book.borrow();
        System.out.println("Borrowed book: " + book.getTitle() + " by " + users.get(userId).getUserName());
    }
    public void returnBook(String isbn, String userId) throws BookNotFoundException, BookAlreadyReturnedException {
        Book book = findBook(isbn);
        book.returnBook();
        System.out.println("Returned book: " + book.getTitle()+ " by " + users.get(userId).getUserName());
    }

    private Book findBook(String isbn) throws BookNotFoundException {
        Book book = books.get(isbn);
        if (book == null) {
            throw new BookNotFoundException("Book not found.");
        }
        return book;
    }
}
