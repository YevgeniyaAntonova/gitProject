package module2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RunnerBook2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите количество книг:");
        int n = scanner.nextInt();
        int income;
        int total = 0;
        ArrayList<Book2> books = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            books.add(new Book2(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt()));
            income = books.get(i).income(books.get(i).price, Type.valueOf(books.get(i).type), books.get(i).sold);
            System.out.println(books.get(i).title + " " + income );
            total += income;
        }
        System.out.printf("Total = %d ", total);






    }
}
