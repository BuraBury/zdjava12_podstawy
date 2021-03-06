package Biblioteka;
public class Book {

    private String title;
    private String author;
    private int bookId;
    //todo w przyszłości dodać czytelnika
    //todo w przyszlosci dodać returnDate

    private static int idCounter = 0;

    public Book() {
        this.bookId = idCounter;
        idCounter++;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

        this.bookId = idCounter;
        idCounter++;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + this.title +
                "\nAuthor: " + this.author +
                "\nBook ID: " + this.bookId +
                "\n";
    }
}
