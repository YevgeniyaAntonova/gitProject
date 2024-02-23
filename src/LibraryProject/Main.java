package LibraryProject;

import LibraryProject.Users.Librarian;
import LibraryProject.Users.Member;
import LibraryProject.Users.Role;
import LibraryProject.Users.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Library");
        System.out.println("For Librarian enter 1, for Member user enter 2");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("For Registration enter 1, for Authorization enter 2");
            int m = scanner.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Enter login ");
                    String login = scanner.next();
                    System.out.println("Enter password ");
                    String password = scanner.next();
                    System.out.println("Enter firstName ");
                    String firstName = scanner.next();
                    System.out.println("Enter lastName ");
                    String lastName = scanner.next();
                    System.out.println("Enter workExperience ");
                    int workExperience = scanner.nextInt();
                    Librarian librarianReg = new Librarian(1, login, password, firstName, lastName, Role.LIBRARIAN, workExperience);
                    librarianReg.userRegistration(librarianReg.toString());
                    break;
                case 2:
                    System.out.println("Enter login ");
                    login = scanner.next();
                    System.out.println("Enter password ");
                    password = scanner.next();
                    Librarian librarianAuth = new Librarian(login, password);
                    if (librarianAuth.userAuthorization(login, password)) {
                        librarianAuth.menu();
                    } else {
                        System.out.println("incorrect login or password");
                    }
            }
        } else if ( n == 2) {
            System.out.println("For Registration enter 1, for Authorization enter 2");
            int m = scanner.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Enter login ");
                    String login = scanner.next();
                    System.out.println("Enter password ");
                    String password = scanner.next();
                    System.out.println("Enter firstName ");
                    String firstName = scanner.next();
                    System.out.println("Enter lastName ");
                    String lastName = scanner.next();
                    boolean isActive = true;
                    Member memberReg = new Member(1, login, password, firstName, lastName, Role.MEMBER, isActive);
                    memberReg.userRegistration(memberReg.toString());
                    break;
                case 2:
                    System.out.println("Enter login ");
                    login = scanner.next();
                    System.out.println("Enter password ");
                    password = scanner.next();
                    Member memberAuth = new Member(login, password);
                    if (memberAuth.userAuthorization(login, password)) {
                        memberAuth.menu();
                    } else  {
                        System.out.println("Incorrect login or password");
                    }
            }
        }
    }
}
