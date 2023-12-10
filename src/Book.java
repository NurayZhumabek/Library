import java.sql.SQLOutput;

public class Book {
    private String author;
    private String title;
    private int bookID;
    private double rating;
    private int countScore;

    public Book() {
    }

    public Book(String author, String title, int bookID) {
        this.author = author;
        this.title = title;
        this.bookID = bookID;
    }
    void displayInfo() {
        System.out.println("Book: " + title + "\nAuthor: " + author + "\nBook ID: " + bookID);
        System.out.println();

    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getCountScore() {
        return countScore;
    }

    public void setCountScore(int countScore) {
        this.countScore = countScore;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }


}
