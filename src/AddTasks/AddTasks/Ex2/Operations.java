package AddTasks.AddTasks.Ex2;
import java.util.Scanner;

public class Operations {
    String operations;
    int x = 0;
    public Operations(String operations){
        this.operations = operations;
    }
    public Operations(){}
    public void Solution(){
        String [] oper = operations.split(" ");
        for (int i = 0; i < oper.length; i++) {
            switch (oper[i]){
                case "X++":
                    x++;
                    break;
                case "++X":
                    x++;
                    break;
                case "X--":
                    x--;
                    break;
                case "--X":
                    x--;
                    break;
            }
        }
        System.out.printf("x = %d", x);
    }

}
