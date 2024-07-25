package coupling.looseCoupling;

public class Main {
    public static void main(String[] args) {
        Database database = new DatabaseStore();
        LibraryManager libraryManager = new LibraryManager(database);

        Book book = new Book(1001, "Programming with C", "Balaguru Shami");
        libraryManager.addBook(book);

        User user = new User(1, "Mr. John");
        libraryManager.addUser(user);

        System.out.println("Book: "+libraryManager.getBookById(1001).getBookTitle()+"\tAuthor: "+libraryManager.getBookById(1001).getBookAuthor());
        System.out.println("User: "+libraryManager.getUserById(1).getUsername());
    }
}
