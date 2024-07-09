package oops.inheritance.library;

public class Book extends LibraryItem{
    private int numberOfPages;
    public Book(String title, String author, String publicationYear, int numberOfPages) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("Please handle the book carefully");
    }
}
