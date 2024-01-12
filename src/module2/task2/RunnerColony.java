package module2.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunnerColony {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Count of Colony:");
        int n = scanner.nextInt();
        int minPrice =0;
        int price;

        ArrayList<Colony> colonies = new ArrayList<Colony>();

        for (int i = 0; i < n; i++) {
            colonies.add(new Colony(scanner.next(), scanner.nextInt(), scanner.nextInt()));
            System.out.println(colonies.get(i).name);
            ArrayList<Apartment> aparts = new ArrayList<Apartment>();
            for (int j = 0; j < colonies.get(i).apCount; j++) {
                aparts.add(new Apartment(scanner.next(), scanner.nextInt(), scanner.next()));
                System.out.println(aparts.get(j).title + " " + aparts.get(j).smet + " " + aparts.get(j).type);

            price = colonies.get(i).priceAp(aparts.get(j).type,colonies.get(i).smetPrice, aparts.get(j).smet);
            minPrice = colonies.get(0).priceAp(aparts.get(0).type,colonies.get(0).smetPrice, aparts.get(0).smet);
                System.out.println(price);
                //System.out.println(minPrice);
                if (price < minPrice){
                    minPrice = price;
                    System.out.println(colonies.get(i).name + " " + aparts.get(j).title);
                } else {minPrice = minPrice;}
            }

        }

    }

}
