package LibraryProject.Items;

import java.io.*;
import java.util.Scanner;

public class Magazine extends LibraryItem implements PaperItem, BorrowableItem {
    static Scanner scanner = new Scanner(System.in);
    long issueNumber;
    String issuer;
    String name;
    public Magazine(){
        super();
    }
    public Magazine(int id, String name, long issueNumber, String issuer, String borrower, boolean isAvailable){
        super(id, borrower, isAvailable);
        this.issueNumber = issueNumber;
        this.issuer = issuer;
        this.name = name;
    }

    public long getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(long issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[Magazine: %s, %s]", issuer);
    }

    public void addMagazine(){
        try{
            FileWriter magazines = new FileWriter(".\\src\\LibraryProject\\files\\magazines.txt", true);
            System.out.println("Enter id of magazine");
            int id = scanner.nextInt();
            System.out.println("Enter name of magazine");
            String name = scanner.next();
            System.out.println("Enter issueNumber of magazine");
            long issueNumber = scanner.nextLong();
            System.out.println("Enter issuer of magazine");
            String issuer = scanner.next();
            Magazine magazineNew = new Magazine(id,name , issueNumber, issuer, null, true);
            PrintWriter print = new PrintWriter(magazines);
            print.printf("%s" + "%n", magazineNew);
            print.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String toString(){
        return String.format("%d %s %s %d %s %s", id, name,issuer, issueNumber, borrower, isAvailable);
    }

}
