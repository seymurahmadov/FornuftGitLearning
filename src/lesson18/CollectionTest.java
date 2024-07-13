package lesson18;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {


//        Set<String> names = new TreeSet<>();
//        names.add("Sofiya");
//        names.add("Yusif");
//        names.add("Yusif");
//        names.add("Kamil");
//        names.add("Vusal");
//        names.add("Ugur");
//        names.add("Aygun");
//
//
//        Set<Integer> digit = new TreeSet<>();
//        digit.add(555);
//        digit.add(1005);
//        digit.add(1);
//        digit.add(101);
//        digit.add(1);
//        digit.add(98);
//
//
//        digit.add(1);


        Stack<String> names = new Stack<>();
        names.add("Sofiya");
        names.add("Yusif");
        names.add("Yusif");
        names.add("Kamil");
        names.add("Vusal");
        names.add("Ugur");
        names.add("Aygun");


        System.out.println(names.peek());

        for (String name : names) {
            System.out.println(name);
        }


        ArrayList<String> arrayList = new ArrayList<>();
    }
}
