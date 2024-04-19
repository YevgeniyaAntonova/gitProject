package module3.HashMap2;

import java.util.HashMap;
import java.util.Map;

public class Product {
    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        fillMap(toyMap);
        entrySet(toyMap);

    }
    public static void fillMap(Map toyMap) {
        toyMap.put("Monster track", new Toy("Monster track", 2500));
        toyMap.put("Teddy bear", new Toy("Teddy bear", 1250));
        toyMap.put("Machine gun", new Toy("Machine gun", 700));
        toyMap.put("Candy", new Toy("Candy", 10));
        toyMap.put("Angry bird", new Toy("Angry bird", 1000));
    }

    public static void entrySet(Map toyMap){
        toyMap.forEach((key, value) -> System.out.println("[Product]: " + key + " [Toy]: " + value));
    }
    public static void keySet(Map toyMap){
        toyMap.forEach((key,value) -> System.out.println(key));
    }
    public static void values(Map toyMap){
        toyMap.forEach((key, value) -> System.out.println(value));
    }

}
