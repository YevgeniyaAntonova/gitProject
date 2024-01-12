package module2.task2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RunnerColony {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Count of Colony:");
        int n = scanner.nextInt();
        int priceAp;
        int minPrice = 0;

        ArrayList<Colony> colonies = new ArrayList<Colony>();
        for (int i = 0; i < n; i++) {
            ArrayList<Apartment> aparts = new ArrayList<Apartment>();
            colonies.add(new Colony(scanner.next(), scanner.nextInt(), scanner.nextInt(), aparts));

            for (int j = 0; j < colonies.get(i).apCount; j++) {
                aparts.add(new Apartment(scanner.next(), scanner.nextInt(), scanner.next()));
                System.out.printf("%s %d %s %n", aparts.get(j).title, aparts.get(j).smet, aparts.get(j).type);
                priceAp = colonies.get(i).priceAp(aparts.get(j).type, colonies.get(i).smetPrice, aparts.get(j).smet);
                System.out.printf("%s - %d %n", aparts.get(j).title, priceAp);

                //найти минимальную стоимость


            }
        }
    }
}


