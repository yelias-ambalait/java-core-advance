package coupling.tightCoupling;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        Book book = new Book("progboook01", "Java Programming", "Joyce Farrell");
        User user = new User("cse01105819", "Anik Sen");

        libraryManager.addBook(book);
        libraryManager.addUser(user);

        System.out.println("Book: "+ libraryManager.getBookById("progboook01").getTitle());
        System.out.println("User: "+libraryManager.getUserById("cse01105819").getName());
    }
}
