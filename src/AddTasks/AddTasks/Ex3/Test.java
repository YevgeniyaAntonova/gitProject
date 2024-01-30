package AddTasks.Ex3;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("jewels:");
        String jewels = scanner.next();
        System.out.println("stones:");
        String stones = scanner.next();
        Jewels j = new Jewels(jewels, stones);
        j.jewelsCount();

    }
}
