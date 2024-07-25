package practice;

public interface Database {
    void saveBook(Book book);
    void saveUser(User user);

    Book getBookById(int bookId);
    User getUserById(int userId);
}
