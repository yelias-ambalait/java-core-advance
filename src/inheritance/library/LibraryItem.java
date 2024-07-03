package inheritance.library;

public class LibraryItem {

    private String title;
    private String author;
    private String publicationYear;
    private boolean isAvailable;

    public LibraryItem(String title, String author, String publicationYear) {
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

    public String getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title+ " borrowed successfully.");
        }else{
            System.out.println(title+" is currently unavailable.");
        }
    }
    public void returnItem(){
        isAvailable = true;
        System.out.println(title+ " returned successfully.");
    }
}
