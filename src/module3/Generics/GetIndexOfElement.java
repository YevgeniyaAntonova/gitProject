package Generics;

import java.util.List;
import java.util.Scanner;

public class GetIndexOfElement {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<String> colors = List.of("Red", "Green", "Blue", "Orange", "White");

        System.out.println("Index of 3 in numbers: " + getIndexOfElement(nums, 3));
        System.out.println("Index of 6 in numbers: " + getIndexOfElement(nums, 6));
        System.out.println("Index of \"Green\" in numbers: " + getIndexOfElement(colors, "Green"));
        System.out.println("Index of \"Black\" in numbers: " + getIndexOfElement(colors, "Black"));


    }

    public static <T> int getIndexOfElement(List<T> arr, T element ){
        for(int i = 0; i < arr.size(); i++){
            if (arr.get(i).equals(element)){
                return i;
            }
        }
        return -1;
    }
}
