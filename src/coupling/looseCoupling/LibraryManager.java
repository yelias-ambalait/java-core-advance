package coupling.looseCoupling;

public class LibraryManager {
   private Database database;


    public LibraryManager(Database database) {
        this.database = database;
    }

    public void addBook(Book book){
        database.saveBook(book);
    }

    public void addUser(User user){
        database.saveUser(user);
    }

    public Book getBookById(int bookId){
        return database.getBookById(bookId);
    }

    public User getUserById(int userId){
        return database.getUserById(userId);
    }

}
