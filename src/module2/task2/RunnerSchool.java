package module2.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunnerSchool {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        ArrayList<School> schools = new ArrayList<School>();

        for (int i = 0; i < n; i++){
            ArrayList<Esper> espers = new ArrayList<Esper>();
            schools.add(new School(scanner.next(), scanner.next(), scanner.nextInt(), espers));
            for(int j = 0; j < schools.get(i).espCount; j++){
                espers.add(new Esper(scanner.next(), scanner.nextInt(), scanner.next()));
            }
            schools.get(i).ListSchool(espers, schools.get(i).spec_type);
        }
    }
}
