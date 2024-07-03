package inheritance.library;

public class Main {
    public static void main(String[] args) {

        Library l = new Library();
        l.addItem(new Book("Al Quran", "Allah", "Undefined", 114));
        l.getItems().get(0).borrow();

        l.addItem(new AudioBook("Al Quran Audio", "Allah", "Undefined", "Muhammad(SA)", 1800));
        l.display();
    }
}
