package LibraryProject.Items;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public abstract class LibraryItem {
    int id;
    boolean isAvailable;
    String borrower;
    static Scanner scanner = new Scanner(System.in);

    public LibraryItem() {
    }

    public LibraryItem(int id, String borrower, boolean isAvailable) {
        this.id = id;
        this.borrower = borrower;
        this.isAvailable = isAvailable;

    }

    public abstract void displayDetails();

    public void borrowItem(String login, String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\files\\" + fileName));
            String line;
            int count = 0;
            ArrayList<String> items = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                items.add(line);
                count++;
                System.out.println(line);
            }
            reader.close();

            FileWriter itemsEmpty = new FileWriter(".\\src\\LibraryProject\\files\\" + fileName);
            itemsEmpty.write("");
            itemsEmpty.close();
            System.out.println("Enter id");
            String n = scanner.next();
            for (int i = 0; i < count; i++) {
                String linesUpdate = null;
                String[] arr = items.get(i).split(" ");
                if (n.equals(arr[0])) {
                    arr[arr.length - 1] = "false";
                    arr[arr.length - 2] = login;
                } else {
                }
                linesUpdate = String.join(" ", arr);

                FileWriter itemsUpdate = new FileWriter(".\\src\\LibraryProject\\files\\" + fileName, true);
                PrintWriter print = new PrintWriter(itemsUpdate);
                print.printf("%s" + "%n", linesUpdate);
                print.close();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void returnItem(String login, String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\files\\" + fileName));
            String line;
            int count = 0;
            ArrayList<String> items = new ArrayList<String>();

            while ((line = reader.readLine()) != null) {
                items.add(line);
                count++;
            }
            reader.close();

            FileWriter itemsEmpty = new FileWriter(".\\src\\LibraryProject\\files\\" + fileName);
            itemsEmpty.write("");
            itemsEmpty.close();
            System.out.println("Enter id");
            String n = scanner.next();
            for (int i = 0; i < count; i++) {
                String linesUpdate = null;
                String[] arr = items.get(i).split(" ");
                if (n.equals(arr[0])) {
                    arr[arr.length - 1] = "true";
                    arr[arr.length - 2] = null;

                } else {
                }
                linesUpdate = String.join(" ", arr);

                FileWriter itemsUpdate = new FileWriter(".\\src\\LibraryProject\\files\\" + fileName, true);
                PrintWriter print = new PrintWriter(itemsUpdate);
                print.printf("%s" + "%n", linesUpdate);
                print.close();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void listOfItems(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\files\\" + fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void borrowedItems(String login, String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\files\\" + fileName));

            String line;
            int count = 0;
            ArrayList<String> items = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                items.add(line);
                count++;
            }
            reader.close();
            for (int i = 0; i < count; i++) {
                String[] arr = items.get(i).split(" ");
                if (login.equals(arr[arr.length-2])) {
                    line = String.join(" ", arr);
                    System.out.println(line);
                } else{
                    System.out.println("no borrowed");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
