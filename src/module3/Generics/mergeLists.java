package Generics;

import java.util.ArrayList;
import java.util.List;

public class mergeLists {
    public static void main(String[] args) {
        List<Integer> numbs1 = List.of(1, 3, 5, 7);
        List<Integer> numbs2 = List.of(2, 4, 8, 10);
        System.out.println("List of numbers:");
        System.out.println(numbs1);
        System.out.println(numbs2);
        System.out.println();

        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
        System.out.println("List of colors:");
        System.out.println(colors1);
        System.out.println(colors2);
        System.out.println();

        System.out.println("Merged Numbers: " + mergeLists(numbs1, numbs2));
        System.out.println("Merged Colors:: " + mergeLists(colors1, colors2));
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2){
        List<T> listTotal = new ArrayList<>();
        for (int i = 0; i < Math.max(list1.size(), list2.size()); i++){
            if (i < list1.size())
        listTotal.add(list1.get(i));
            if(i < list2.size())
        listTotal.add(list2.get(i));}
        return listTotal;
    }
}
