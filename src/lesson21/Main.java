package lesson21;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        FuncInterface functionalInterface = (int x , int y ) -> x + y;
//
//        System.out.println(functionalInterface.test(7,7));

        List<Integer> numbers = Arrays.asList(5, 8, 4, 51, 2, 4, 6, 59, 94, 8, 3);


       Double a =  numbers.stream().filter(num -> num > 10)
                .mapToDouble(item ->item )
                .sum();


        System.out.println(a);




//        for (Integer num : numbers){
//            System.out.println(num);
//        }


//        numbers.forEach(item -> System.out.println(item));

    }
}
