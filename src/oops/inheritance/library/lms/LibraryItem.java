package oops.inheritance.library.lms;

import java.util.ArrayList;
import java.util.List;

public class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not currently available.");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " returned successfully.");
    }
}

class Books extends LibraryItem {

    private int numPages;

    public Books(String title, String author, int publicationYear, int numPages) {
        super(title, author, publicationYear);
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("Please handle the book carefully.");
    }
}

class Audiobook extends LibraryItem {

    private String narrator;
    private double duration;

    public Audiobook(String title, String author, int publicationYear, String narrator, double duration) {
        super(title, author, publicationYear);
        this.narrator = narrator;
        this.duration = duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("Enjoy listening to the audiobook!");
    }
}

class Movies extends LibraryItem {

    private String director;
    private String genre;

    public Movies(String title, String author, int publicationYear, String director, String genre) {
        super(title, author, publicationYear);
        this.director = director;
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("Don't forget to return the movie on time!");
    }
}

class Library {

    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> getItems() {
        return items;
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Books("The Lord of the Rings", "J.R.R. Tolkien", 1954, 1138));
        library.addItem(new Audiobook("Dune", "Frank Herbert", 1965, "Simon Vance", 18.5));
        library.addItem(new Movies("The Shawshank Redemption", "Frank Darabont", 1994, "Frank Darabont", "Drama"));

        System.out.println("Items in the library:");
        for (LibraryItem item : library.getItems()) {
            System.out.println(item.getTitle() + " (" + item.getClass().getSimpleName() + ")");
        }

        System.out.println("\n");
        library.getItems().get(0).borrow();
        System.out.println("\n");
        library.getItems().get(1).borrow();
        System.out.println("\n");
        library.getItems().get(2).borrow();

        try {
            library.getItems().get(3).borrow();
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
