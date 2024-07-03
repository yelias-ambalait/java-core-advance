package polymorphism.methodOverloading;

public class Book extends Item {

    String author;
    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{name: " + super.getName() + ", " + super.getPrice() +"$"+ ", author: " +author+"}";
    }
}
