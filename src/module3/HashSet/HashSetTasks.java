package module3.HashSet;

import java.util.*;

public class HashSetTasks {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //South Africa, Australia, India
        HashSet<String> h = new HashSet<String>();
        h.add("South Africa");
        h.add("Australia");
        h.add("India");
        System.out.println(h);

        task12(h);
    }
    public static void task1(HashSet h){
        h.add("Kazakhstan");
        System.out.println(h);
    }
    public static void task2(HashSet h){
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
    public static void task3(HashSet h){
        int count = h.size();
        System.out.println(count);
    }
    public static void task4(HashSet h){
        h.clear();
        System.out.println(h);

    }
    public static void task5(HashSet h){
        h.clear();
        if(h.isEmpty()){
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }
    }
    public static void task6(HashSet h){
        HashSet<String> hs = new HashSet<>();
        hs =(HashSet) h.clone();
        System.out.println(hs);
    }
    public static void task7(HashSet h){
        String[] arr = new String[h.size()];
        h.toArray(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void task8(HashSet h){
        Set<String> tree_set = new TreeSet<>(h);
        System.out.println(tree_set);
    }
    public static void task10(HashSet h){
        HashSet<String> h2 = new HashSet<String>();
        h2.add("China");
        h2.add("India");
        h2.add("Australia");
        System.out.println(h2);
        for (Object i: h){
            System.out.println(h2.contains(i) ? "YES": "NO");
        }

    }
    public static void task11(HashSet h){
        HashSet<String> h2 = new HashSet<String>();
        h2.add("China");
        h2.add("India");
        h2.add("Australia");
        System.out.println(h2);
        h.removeAll(h2);
        System.out.println(h);
    }
    public static void task12(HashSet h){
        h.removeAll(h);
        System.out.println(h);
    }
}
