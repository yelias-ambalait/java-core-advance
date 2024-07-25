package practice;

public class Book {
    int bookId;
    String bookTitle;
    String author;

    public Book(int id, String bookTitle, String author) {
        this.bookId = id;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }
}
