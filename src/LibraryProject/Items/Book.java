package LibraryProject;

public class Book extends LibraryItem implements PaperItem, BorrowableItem{
    String author;
    String title;
    String isbn;
    public Book(int id, String name, boolean isAvailable, String author, String title, String isbn){
        super(id, name, isAvailable);
        this.author = author;
        this.title = title;
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[Book: %s, %s]", title, author);
    }

    @Override
    public void borrow() {

    }
}
