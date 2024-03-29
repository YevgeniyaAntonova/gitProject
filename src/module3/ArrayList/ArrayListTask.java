package module3.ArrayList;

import java.util.*;

public class ArrayListTask {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
       addlist(names);
        exercise19();
    }
    public static void addlist(ArrayList<String> names) {

        //Tom,Robert,Alice,Kate,Sam
        names.add("Tom");
        names.add("Robert");
        names.add("Alice");
        names.add("Kate");
        names.add("Sam");
        System.out.println(names);
    }

    public static void exercise2(ArrayList<String> names){
        String name;
        for (String s : names) {
            name = s;
            System.out.println(name);
        }
    }

    public static void exercise3(ArrayList<String> names){
        names.addFirst("Zheniya");
        System.out.println(names);
    }

    public static void exercise4(ArrayList<String> names){
        System.out.println("до извления:");
        System.out.println(names);
        System.out.println("номер элемента для извлечения");
        int n = scanner.nextInt();
        names.remove(n-1);
        System.out.println("после извлечения:");
        System.out.println(names);
    }

    public static void exercise5(ArrayList<String> names){
        System.out.println("номер элемента для обновления");
        int n = scanner.nextInt();
        System.out.println("введите на что обновить");
        String newValue = scanner.next();
        names.set(n, newValue);
        System.out.println(names);
    }

    public static void exercise6(ArrayList<String> names){
        names.remove(3-1);
        System.out.println(names);
    }

    public static void exercise7(){

        ArrayList<Integer> number = new ArrayList<>();
        number.add(6);
        number.add(9);
        number.add(15);
        number.add(60);
        number.add(0);

        System.out.println("enter element:");
        int n = scanner.nextInt();
        if(number.contains(n)){
            System.out.println("element in list");
        } else {
            System.out.println("element is not absent");
        }
    }

    public static void exercise8(ArrayList<String> names){
        System.out.println("before sort:");
        System.out.println(names);
        Collections.sort(names);
        System.out.println("after sort:");
        System.out.println(names);

    }

    public static void exercise9(ArrayList<String> names){
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Jonh");
        names2.add("Billy");
        System.out.println("2 list:");
        System.out.println(names);
        System.out.println(names2);
        System.out.println("after:");
        Collections.copy(names,names2);
        System.out.println("after:");
        System.out.println(names);
    }

    public static void exercise10(ArrayList<String> names){
        Collections.shuffle(names);
        System.out.println(names);
    }

    public static void exercise11(ArrayList<String> names){
        Collections.reverse(names);
        System.out.println(names);
    }

    public static void exercise12(ArrayList<String> names){
        System.out.println("before:");
        System.out.println(names);

        System.out.println("after:");
        System.out.println(names.subList(1,3));
    }

    public static void exercise13(ArrayList<String> names){
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Alice");
        names2.add("Tom");
        System.out.println(names2);
        for (String n : names2) {
            for (String s : names){
                if (s.contains(n)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }}
        }
    }

    public static void exercise14(ArrayList<String> names){
        Collections.swap(names,1,4);
        System.out.println("after:");
        System.out.println(names);
    }

    public static void exercise15(ArrayList<String> names){
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Bill");
        names2.add("Jess");
        System.out.println(names2);
        ArrayList<String> nameBig = new ArrayList<>();
        nameBig.addAll(names);
        nameBig.addAll(names2);
        System.out.println(nameBig);
    }

    public static void exercise16(ArrayList<String> names){
        ArrayList<String> cloneNames = (ArrayList<String>) names.clone();
        System.out.println(cloneNames);
    }

    public static void exercise17(ArrayList<String> names){
        names.removeAll(names);
        System.out.println(names);
    }

    public static void exercise18(ArrayList<String> names){
        System.out.println(names.isEmpty());
        ArrayList<String> empty = new ArrayList<>();
        System.out.println(empty.isEmpty());
    }

    public static void exercise19(){
        String[] names = new String[]{"Tom", "Robert", "Alice", "Kate", "Sam"};
        String[] nameNew = Arrays.copyOfRange(names,1, 3);
        System.out.println(Arrays.toString(nameNew));
    }
}
