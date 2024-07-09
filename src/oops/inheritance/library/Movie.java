package oops.inheritance.library;

public class Movie extends LibraryItem{

    private String director;
    private String genre;
    public Movie(String title, String author, String publicationYear, String director, String genre) {
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
        System.out.println("Don't forget to return the movie on time.");
    }
}
