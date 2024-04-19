package Generics;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        Double[] numbs = {2.0, 1.5, 4.5, 2.5, 1.5};

        System.out.println("Original list of numbers: " + Arrays.toString(numbers));
        System.out.println("Sum of even numbers: " + sumOfEven(numbers));
        System.out.println("Sum of odd numbers: " + sumOfOdd(numbers));

        System.out.println();

        System.out.println("Original list of numbers: " + Arrays.toString(numbs));
        System.out.println("Sum of even numbers: " + sumOfEven(numbs));
        System.out.println("Sum of odd numbers: " + sumOfOdd(numbs));

    }

    public static <T extends Number > double sumOfEven(T[] numbers){
        double sum = 0;
        for(T number: numbers){
            if (number.doubleValue()% 2 == 0){
                sum += number.doubleValue();
            }
        }
        return sum;
    }
    public static <T extends Number > double sumOfOdd(T[] numbers){
        double sum = 0;
        for(T number: numbers){
            if (number.doubleValue()% 2 != 0){
                sum +=  number.doubleValue();
            }
        }
        return sum;
    }


}
