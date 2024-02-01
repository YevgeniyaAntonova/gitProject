package AddTasks.AddTasks.Ex5;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //String command = scanner.nextLine();
        GoalParser goal = new GoalParser(scanner.next());
        System.out.println(goal.Interpret());

    }
}
