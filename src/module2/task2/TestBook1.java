package module2.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBook1 {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        Book1 javaDummy = new Book1("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
    }
}
