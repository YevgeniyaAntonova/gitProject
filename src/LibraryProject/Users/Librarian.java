package LibraryProject.Users;

import LibraryProject.Items.Book;
import LibraryProject.Items.DVD;
import LibraryProject.Items.Magazine;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Librarian extends User{
    int workExperience;
    public Librarian(String login, String password){
        super(login, password);
    }
    public Librarian(int id, String login, String password, String firstName, String lastName, Role role, int workExperience){
        super(id, login, password, firstName, lastName, String.valueOf(role));
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public void userRegistration(String librarian) {
        try {
            FileWriter librarians = new FileWriter(".\\src\\LibraryProject\\files\\librarians.txt", true);
            PrintWriter print = new PrintWriter(librarians);
            print.printf("%s" + "%n", librarians);
            print.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public boolean userAuthorization(String login, String password) {
        boolean goToMenu = true;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\LibraryProject\\files\\librarians.txt"));
            String line;
            int count = 0;
            ArrayList<String> libs = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                libs.add(line);
                count ++;
            }
            reader.close();
            for (int i = 0; i < count; i++){
            String[] arr = libs.get(i).split(" ");
               if(login.equals(arr[1]) && password.equals(arr[2])){
                    goToMenu = true;
                } else {
                   goToMenu = false;
               }
                }
        } catch (IOException e){
            e.printStackTrace();
        }
        return goToMenu;
    }

    static Scanner scanner = new Scanner(System.in);

    public void menu(){
        int menuNum;
        do {
            System.out.println("Menu:");
            System.out.println("1. Items");
            System.out.println("2. Members");
            System.out.println("0. Exit");
            menuNum = scanner.nextInt();
            int n = switch (menuNum) {
                case 1:
                    System.out.println("1. Book");
                    System.out.println("2. DVD");
                    System.out.println("3. Magazine");
                    System.out.println("0. Exit");
                    int menuNumItems;
                    menuNumItems = scanner.nextInt();
                    if (menuNumItems == 1){
                        System.out.println("1. List of books");
                        System.out.println("2. Add book");
                        int k = scanner.nextInt();
                        Book book = new Book();
                        if (k == 1){
                            book.listOfItems("books.txt");
                        } else if (k == 2){
                            book.addBook();
                        }
                    } else if(menuNumItems == 2){
                        System.out.println("1. List of DVDs");
                        System.out.println("2. Add DVD");
                        int k = scanner.nextInt();
                        DVD dvd = new DVD();
                        if (k == 1){
                            dvd.listOfItems("dvds.txt");
                        } else if (k == 2){
                            dvd.addDVD();
                        }
                    } else if (menuNumItems == 3){
                        System.out.println("1. List of Magazines");
                        System.out.println("2. Add Magazine");
                        int k = scanner.nextInt();
                        Magazine magazine = new Magazine();
                        if (k == 1){
                            magazine.listOfItems("magazines.txt");
                        } else if (k == 2){
                            magazine.addMagazine();
                        }
                    } else{
                    }
                    yield 1;
                case 2:
                    System.out.println("1. List of Members");
                    System.out.println("2. Activate members");
                    System.out.println("3. Deactivate members");
                    System.out.println("0. Exit");
                    Member member = new Member();
                    int menuNumUsers;
                    menuNumUsers = scanner.nextInt();
                    if (menuNumUsers == 1){
                        member.listOfMembers();
                    } else if(menuNumUsers == 2){
                        System.out.println("enter members's login");
                        String login = scanner.next();
                        member.activate(login);
                    }  else if(menuNumUsers == 3){
                        System.out.println("enter members's login");
                        String login = scanner.next();
                        member.deActivate(login);
                    } else{
                    }
                    yield 2;
                case 0:
                    yield 0;
                default:
                    yield 0;
            };
        } while (menuNum != 0);

        if (menuNum == 0){
            return;}
        System.out.println("1. Items List");
        System.out.println("2. Members");
        System.out.println("0. Exit");
    }

    public String toString(){
        return String.format("%d %s %s %s %s %s %d", id, login, password, firstName, lastName, role, workExperience);
    }
}

