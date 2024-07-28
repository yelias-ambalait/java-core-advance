package exceptions.mixedTypeException.libraryManagement;

public class Book {
    private String isbn;
    private String title;
    private boolean isBorrowed;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.isBorrowed = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void borrow() throws BookAlreadyBorrowedException {
        if (isBorrowed) {
            throw new BookAlreadyBorrowedException("Book already borrowed.");
        }
        isBorrowed = true;
    }
    public void returnBook() throws BookAlreadyReturnedException{
        if (!isBorrowed) {
            throw new BookAlreadyReturnedException("Book already returned.");
        }
        isBorrowed = false;
    }

}
