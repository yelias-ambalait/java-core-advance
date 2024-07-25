package practice;

public class Main {
    public static void main(String[] args) {
        Database database  = new DatabaseStore();
        LibraryManager libraryManager = new LibraryManager(database);

        Book book = new Book(1, "Java Programming", "Mcgrill");
        Book book1 = new Book(2, "C Programming", "Balaguru");
        Book book2 = new Book(3, "Python Programming", "John");
        Book book3 = new Book(4, "C# Programming", "Smith");
        Book book4 = new Book(5, ".Net Programming", "Bill Gates");

        User user1 = new User(1, "Mc Gyver");
        User user2 = new User(1, "Charlie Chaplin");
        User user3 = new User(1, "Mr. Bean");

        libraryManager.addBook(book);
        libraryManager.addBook(book1);
        libraryManager.addBook(book2);
        libraryManager.addBook(book3);
        libraryManager.addBook(book4);

        libraryManager.addUser(user1);
        libraryManager.addUser(user2);
        libraryManager.addUser(user3);
    }
}
