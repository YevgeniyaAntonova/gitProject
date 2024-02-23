package LibraryProject.Users;

import LibraryProject.Items.Book;
import LibraryProject.Items.BorrowableItem;
import LibraryProject.Items.DVD;
import LibraryProject.Items.Magazine;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Member extends User{
    boolean isActive;
    BorrowableItem[] borrowableItems;
    public Member(){
        super();
    }
    public Member(String login, String password){
        super(login, password);
    }
    public Member(int id, String login, String password, String firstName, String lastName, Role role, boolean isActive){
        super(id, login, password, firstName, lastName, String.valueOf(role));
        this.isActive = isActive;
    }
    public Member(int id, String login, String password, String firstName, String lastName, Role role, boolean isActive, BorrowableItem[] borrowableItems){
        super(id, login, password, firstName, lastName, String.valueOf(role));
        this.isActive = isActive;
        this.borrowableItems = new BorrowableItem[]{};
    }

    @Override
    public void activate(String login) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\files\\members.txt"));
            String line;
            int count = 0;
            ArrayList<String> members = new ArrayList<String>();

            while ((line = reader.readLine()) != null) {
                members.add(line);
                count++;
            }
            reader.close();
            FileWriter membersEmpty = new FileWriter(".\\src\\LibraryProject\\files\\members.txt");
            membersEmpty.write("");
            membersEmpty.close();
            for (int i = 0; i < count; i++) {
                String linesUpdate = null;
                String[] arr = members.get(i).split(" ");
                if (login.equals(arr[1])) {
                    arr[arr.length-1] = "true";
                } else {
                }
                linesUpdate = String.join(" ", arr);

                FileWriter membersUpdate = new FileWriter(".\\src\\LibraryProject\\files\\members.txt", true);
                PrintWriter print = new PrintWriter(membersUpdate);
                print.printf("%s" + "%n", linesUpdate);
                print.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deActivate(String login) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\files\\members.txt"));
            String line;
            int count = 0;
            ArrayList<String> members = new ArrayList<String>();

            while ((line = reader.readLine()) != null) {
                members.add(line);
                count++;
            }
            reader.close();
            FileWriter membersEmpty = new FileWriter(".\\src\\LibraryProject\\files\\members.txt");
            membersEmpty.write("");
            membersEmpty.close();
            for (int i = 0; i < count; i++) {
                String linesUpdate = null;
                    String[] arr = members.get(i).split(" ");
                    if (login.equals(arr[1])) {
                        arr[arr.length-1] = "false";
                    } else {
                    }
                linesUpdate = String.join(" ", arr);

               FileWriter membersUpdate = new FileWriter(".\\src\\LibraryProject\\files\\members.txt", true);
                PrintWriter print = new PrintWriter(membersUpdate);
                print.printf("%s" + "%n", linesUpdate);
                print.close();
                }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void userRegistration(String member) {
        try {
            FileWriter members = new FileWriter(".\\src\\LibraryProject\\files\\members.txt", true);
            PrintWriter print = new PrintWriter(members);
            print.printf("%s" + "%n", members);
            print.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public boolean userAuthorization(String login, String password) {
        boolean goToMenu = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\files\\members.txt"));
            String line;
            int count = 0;
            ArrayList<String> members = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                members.add(line);
                count ++;
            }
            reader.close();
            for (int i = 0; i < count; i++){
                String[] arr = members.get(i).split(" ");
                if(login.equals(arr[1]) && password.equals(arr[2])){
                    if (arr[arr.length-1].equals("true")){

                        goToMenu = true;
                    } else{
                        System.out.println("login is not active, contact a librarian");
                    }
                } else{

                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return goToMenu;
    }

    public void listOfMembers(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\members.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void menu() {
        int menuNum;
        do {
            System.out.println("Menu:");
            System.out.println("1. List of Items");
            System.out.println("2. List of borrowed items");
            System.out.println("3. Borrow item");
            System.out.println("4. Return item");
            System.out.println("0. Exit");
            menuNum = scanner.nextInt();
            Book book = new Book();
            DVD dvd = new DVD();
            Magazine magazine = new Magazine();
            int n = switch (menuNum) {
                case 1:
                    System.out.println("1. Book");
                    System.out.println("2. DVD");
                    System.out.println("3. Magazine");
                    System.out.println("0. Exit");
                    int menuNumItems;
                    menuNumItems = scanner.nextInt();
                    if (menuNumItems == 1){
                            book.listOfItems("books.txt");
                    } else if(menuNumItems == 2){
                            dvd.listOfItems("dvds.txt");
                        } else if (menuNumItems == 3){
                            magazine.listOfItems("magazines.txt");
                    } else{
                    }
                    yield 1;
                case 2:
                    System.out.println("1. Book");
                    System.out.println("2. DVD");
                    System.out.println("3. Magazine");
                    System.out.println("0. Exit");
                    int r = scanner.nextInt();
                    if (r == 1){
                        book.borrowedItems(login, "books.txt");
                    } else if (r == 2){
                        dvd.borrowedItems(login, "dvds.txt");
                    } else if (r == 3){
                        magazine.borrowedItems(login, "magazines.txt");
                    } else{}

                    yield 2;
                case 3:
                    System.out.println("1. Book");
                    System.out.println("2. DVD");
                    System.out.println("3. Magazine");
                    System.out.println("0. Exit");
                    int k = scanner.nextInt();
                    if (k == 1){
                        book.borrowItem(login, "books.txt");
                    } else if (k == 2){
                        dvd.borrowItem(login, "dvds.txt");
                    } else if (k == 3){
                        magazine.borrowItem(login, "magazines.txt");
                    } else{}
                    yield 3;
                case 4:
                    System.out.println("1. Book");
                    System.out.println("2. DVD");
                    System.out.println("3. Magazine");
                    System.out.println("0. Exit");
                    int s = scanner.nextInt();
                    if (s == 1){
                        book.borrowedItems(login, "books.txt");
                        book.returnItem(login, "books.txt");
                    } else if (s == 2){
                        dvd.borrowedItems(login, "dvds.txt");
                        dvd.returnItem(login, "dvds.txt");
                    } else if (s == 3){
                        magazine.borrowedItems(login, "magazines.txt");
                        magazine.returnItem(login, "magazines.txt");
                    } else{}
                    yield 4;
                case 0:
                    yield 0;
                default:
                    yield 0;
            };
        } while (menuNum != 0);

        if (menuNum == 0){
            return;}
        System.out.println("Menu:");
        System.out.println("1. List of Items");
        System.out.println("2. List of borrowed items");
        System.out.println("3. Borrow item");
        System.out.println("4. Return item");
        System.out.println("0. Exit");
    }

    public String toString(){
        return String.format("%d %s %s %s %s %s %s", id, login, password, firstName, lastName, role, isActive);
    }
}
