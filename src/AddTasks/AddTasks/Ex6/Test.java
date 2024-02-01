package AddTasks.AddTasks.Ex6;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Sentences str = new Sentences("alice and bob love leetcode,i think so too,this is great thanks very much,test,test");
        System.out.println(str.mostWordsFound());
    }
}
