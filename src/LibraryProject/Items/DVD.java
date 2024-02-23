package LibraryProject.Items;

import java.io.*;
import java.util.Scanner;


public class DVD extends LibraryItem implements BorrowableItem {
    static Scanner scanner = new Scanner(System.in);
    String name;
    int runtime;

    public DVD(){
        super();
    }

    public DVD(int id, String name, int runtime, String borrower, boolean isAvailable) {
        super(id, borrower, isAvailable);
        this.runtime = runtime;
        this.name = name;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[DVD: %s, %d]", runtime);
    }

    public void addDVD(){
            try{
                FileWriter dvds = new FileWriter(".\\src\\LibraryProject\\files\\dvds.txt", true);
                System.out.println("Enter id of DVD");
                int id = scanner.nextInt();
                System.out.println("Enter name of DVD");
                String name = scanner.next();
                System.out.println("Enter runTime (in second) of DVD");
                int runtime = scanner.nextInt();
                DVD dvdNew = new DVD( id,  name,  runtime,  null,  true);
                PrintWriter print = new PrintWriter(dvds);
                print.printf("%s" + "%n", dvdNew);
                print.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    public String toString(){
        return String.format("%d %s %d %s %s", id, name, runtime, borrower, isAvailable);
    }



}
