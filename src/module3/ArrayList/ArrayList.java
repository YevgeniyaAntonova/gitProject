package module3.ArrayList;

import java.util.Scanner;

public class ArrayList {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        java.util.ArrayList<String> names = new java.util.ArrayList<String>();
       addlist(names);
        exercise2(names);
        exercise3(names);

    }
    public static void addlist(java.util.ArrayList<String> names) {

        //Tom,Robert,Alice,Kate,Sam
        names.add("Tom");
        names.add("Robert");
        names.add("Alice");
        names.add("Kate");
        names.add("Sam");
        System.out.println(names);
    }
    public static void exercise2(java.util.ArrayList<String> names){
        String name;
        for (int i = 0; i < names.size(); i++){
            name = names.get(i);
            System.out.println(name);
        }
    }
    public static void exercise3(java.util.ArrayList<String> names){
        names.add(0,"Zheniya");
        System.out.println(names);

    }
}
