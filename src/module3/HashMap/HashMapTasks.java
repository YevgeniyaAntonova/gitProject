package module3.HashMap;

import java.util.*;

public class HashMapTasks {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, String> countryAndCity = new HashMap<>();
        //{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
        countryAndCity.put("USA", "Washington DC");
        countryAndCity.put("Norway", "Oslo");
        countryAndCity.put("England", "London");
        countryAndCity.put("Germany", "Berlin");
        System.out.println(countryAndCity);

        task12(countryAndCity);
    }
    public static void task1(HashMap countryAndCity){
        countryAndCity.put("Kazakhstan", "Astana");
        System.out.println(countryAndCity);
    }
    public static void task2(HashMap countryAndCity){
        int size = countryAndCity.size();
        System.out.println(size);
    }
    public static void task3(HashMap countryAndCity){
        HashMap<String, String> hashMap = new HashMap<>();
        countryAndCity.clone();
        hashMap = (HashMap) countryAndCity.clone();
        System.out.println(hashMap);
    }
    public static void task4(HashMap countryAndCity){
        countryAndCity.clear();
        System.out.println(countryAndCity);
    }
    public static void task5(HashMap countryAndCity){
       // countryAndCity.clear();
        if(countryAndCity.isEmpty()){
            System.out.println("HashMap is empty");
        } else {
            System.out.println("HashMap is not empty");
        }
    }
    public static void task6(HashMap countryAndCity){
        HashMap<String, String> hm = new HashMap<>();
        hm.putAll(countryAndCity);
        System.out.println(hm);
    }
    public static void task7(HashMap countryAndCity){
        String key = scanner.nextLine();
        if(countryAndCity.containsKey(key)){
            System.out.printf("HashMap contains key = %s", key);
        } else {
            System.out.printf("HashMap not contains key = %s", key);
        }
    }
    public static void task8(HashMap countryAndCity){
        String value = scanner.nextLine();
        if(countryAndCity.containsValue(value)){
            System.out.printf("HashMap contains value = %s", value);
        } else {
            System.out.printf("HashMap not contains value = %s", value);
        }

    }
    public static void task9(HashMap countryAndCity){
        for(Object entry: countryAndCity.entrySet()){
            System.out.println(entry);
        }
    }
    public static void task10(HashMap countryAndCity){
        System.out.println(countryAndCity.get("Norway"));
    }
    public static void task11(HashMap countyAndCity) {
        Set<String> keys = countyAndCity.keySet();
        System.out.println(keys);
    }
    public static void task12(HashMap countryAndCity){
        ArrayList<String> values = new ArrayList<>(countryAndCity.values());
        System.out.println(values);
    }
}
