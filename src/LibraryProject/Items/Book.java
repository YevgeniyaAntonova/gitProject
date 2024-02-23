package LibraryProject.Items;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Book extends LibraryItem implements PaperItem, BorrowableItem {
    String author;
    String title;
    String isbn;
    public Book(){
        super();
    }
    public Book(int id, String author, String title, String isbn, String borrower, boolean isAvailable){
        super(id, borrower, isAvailable);
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
    static Scanner scanner = new Scanner(System.in);
    public void addBook(){
        try{
            FileWriter books = new FileWriter(".\\src\\LibraryProject\\files\\books.txt", true);
            System.out.println("Enter id of book");
            int id = scanner.nextInt();
            boolean isAvailable = true;
            System.out.println("Enter author of book");
            String author = scanner.next() ;
            System.out.println("Enter title of book");
            String title = scanner.next();
            System.out.println("Enter isbn of book");
            String isbn = scanner.next();
            Book bookNew = new Book(id,author,title,isbn, null, true);
            PrintWriter print = new PrintWriter(books);
            print.printf("%s" + "%n", bookNew);
            print.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
       public String toString(){
        return String.format("%d %s %s %s %s %s", id, author, title, isbn, borrower, isAvailable);
}

    @Override
    public void displayDetails() {

        System.out.printf("[Book: %d %s, %s]", id, title, author);
    }


}
