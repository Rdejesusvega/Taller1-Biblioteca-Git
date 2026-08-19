/**
 * Book
 * Inherits attributes from Material (code, title, publicationYear)
 * and adds its own attributes: author, available.
 */
public class Book extends Material {

    // Own attributes
    private String author;
    private boolean available;

    // Constructor
    public Book(String code, String title, String publicationYear, String author, boolean available) {
        super(code, title, publicationYear);
        this.author = author;
        this.available = available;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString for easy printing/debugging
    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}
