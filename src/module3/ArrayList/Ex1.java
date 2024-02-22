package module3.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        //Tom,Robert,Alice,Kate,Sam
        names.add("Tom");
        names.add("Robert");
        names.add("Alice");
        names.add("Kate");
        names.add("Sam");
        System.out.println(names);

    }
}
