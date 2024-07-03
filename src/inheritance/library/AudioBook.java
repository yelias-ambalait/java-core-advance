package inheritance.library;

public class AudioBook extends LibraryItem{

    private String narrator;
    private int durationOfMinutes;
    public AudioBook(String title, String author, String publicationYear, String narrator, int durationOfMinutes) {
        super(title, author, publicationYear);
        this.narrator = narrator;
        this.durationOfMinutes = durationOfMinutes;
    }

    public String getNarrator() {
        return narrator;
    }

    public int getDurationOfMinutes() {
        return durationOfMinutes;
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("Enjoy listening ot the audiobook.");
    }
}
