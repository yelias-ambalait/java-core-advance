package coupling.looseCoupling;

public class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;

    public Book(int id, String bookTitle, String bookAuthor) {
        this.bookId = id;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
