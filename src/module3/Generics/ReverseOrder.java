package Generics;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<String> colors = List.of("Red", "Green", "Orange");

        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Reversed numbers: " + reverseOrder(numbers));

        System.out.println();

        System.out.println("Original list of colors: " + colors);
        System.out.println("Reversed colors: " + reverseOrder(colors));

    }
    public static <T> List<T> reverseOrder(List<T> list){
        List<T> rList = new ArrayList<>();
        for (int i = list.size() - 1; i >=0; i--){
            rList.add(list.get(i));
        }
        return rList;
    }
}
