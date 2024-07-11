package coupling.looseCoupling;

import coupling.looseCoupling.Book;
import coupling.looseCoupling.Database;
import coupling.looseCoupling.User;

import java.util.HashMap;
import java.util.Map;

public class DatabaseStore implements Database {

    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer, User> users = new HashMap<>();
    @Override
    public void saveBook(Book book) {
        books.put(book.getBookId(), book);
    }

    @Override
    public void saveUser(User user) {
        users.put(user.getUserId(), user);
    }

    @Override
    public Book getBookById(int bookId) {
        return books.get(bookId);
    }

    @Override
    public User getUserById(int userId) {
        return users.get(userId);
    }
}
