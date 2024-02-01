package AddTasks.AddTasks.Ex4;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //String[] words = new String[]{scanner.next()};
        //System.out.println();
        //System.out.println("enter x = ");
        //String x = scanner.nextLine();
        Words words1 = new Words(scanner.next(), scanner.next());
        words1.findWordsContaining();

    }
}
