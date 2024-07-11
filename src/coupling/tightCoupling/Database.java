package coupling.tightCoupling;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, User> users = new HashMap<>();

    public void saveBook(Book book) {
        books.put(book.getId(), book);
    }

    public void saveUser(User user){
        users.put(user.getId(), user);
    }

    public Book getBookById(String id){
        return books.get(id);
    }

    public User getUserById(String id){
        return users.get(id);
    }
}
