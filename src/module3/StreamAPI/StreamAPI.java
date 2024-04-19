package module3.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        task8();
    }
    public static void task1(){
        List<Integer> nums = List.of(1, 3, 6, 8, 10, 18, 36);
        System.out.println("List of numbers: " + nums);
        OptionalDouble avg = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        System.out.println("Average of numbers: " + avg);
    }
    public static void task2(){
        List<String> list = List.of("RED", "grEEn", "white", "Orange", "pink");
       String listL = String.valueOf(list.stream()
               .map(String::toLowerCase)
               .collect(Collectors.toList()));
        System.out.println("Lowercase Strings: " + listL);
        String listUp = String.valueOf(list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
        System.out.println("Uppercase Strings: " + listUp);
    }
    public static void task3(){
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);
        System.out.println("List of numbers: " + nums);
        Integer sumEven = nums.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers: " + sumEven);

        Integer sumOdd = nums.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
    public static void task4(){
        List<Integer> nums = List.of(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Original List of numbers: " + nums);
        List<Integer> list = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("After removing duplicates from the said list: "+ list);
    }
    public static void task5(){
        List<String> colors = List.of("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original list of strings (colors): " + colors);
        char letter1 = 'B';
        long num1 = colors.stream()
                .filter(n -> n.startsWith(String.valueOf(letter1)))
                .count();
        System.out.println("Number of colors starting with 'B': " + num1);
        char letter2 = 'Y';
        long num2 = colors.stream()
                .filter(n -> n.startsWith(String.valueOf(letter2)))
                .count();
        System.out.println("Number of colors starting with 'Y': " + num2);
    }
    public static void task6(){
        List<String> colors = List.of("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original List of strings(colors): " + colors);
        List<String> asc = colors.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted in Ascending Order: " + asc);
        List<String> decs = colors.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted in Descending Order: " + decs);
    }
    public static void task7() {
        List<Integer> nums = List.of(1, 17, 54, 14, 14, 33, 45, -11);
        System.out.println("Original list of numbers: " + nums);
        OptionalInt max = nums.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Maximum value of the said list: " + max);

        OptionalInt min = nums.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Minimum value of the said list: " + min);
    }
    public static void task8() {
        List<Integer> nums = List.of(1, 17, 54, 14, 14, 33, 45, -11);
        System.out.println("List of numbers: " + nums);
        Integer min2 = nums.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second smallest element: " + min2);

        Integer max2 = nums.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second largest element: " + max2);
    }
}
