package AddTasks.Ex1;

import AddTasks.Ex1.IPAddress;

import java.util.Scanner;

public class test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IPAddress address = new IPAddress(scanner.next());
        System.out.println(address.DefahgadIP());
    }
}
