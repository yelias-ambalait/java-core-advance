package coupling.tightCoupling;

public class LibraryManager {
    private Database database = new Database();

    public void addBook(Book book) {
        database.saveBook(book);
    }

    public void addUser(User user) {
        database.saveUser(user);
    }

    public Book getBookById(String id){
        return database.getBookById(id);
    }

    public User getUserById(String id){
        return database.getUserById(id);
    }

}
