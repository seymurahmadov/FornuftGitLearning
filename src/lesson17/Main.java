package lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        CurrencyEnum currencyEnum = CurrencyEnum.USD;
//        System.out.println(currencyEnum.value);
//
//
//        Car car = new Car("BMW", "Black", 25000, CurrencyEnum.USD);
//
//        System.out.println(car);



//        int a = 15;
//
//
//        Integer b = Integer.valueOf(a);
//
//
//        int c = b.intValue();
//
//
//
//
//
//        String d = "Aysu";
//
//
//        int i = Integer.parseInt(d);
//        System.out.println(i);



        String text = "The quick brown fox@gmail.com jumps over the lazy dog.";
        // Using regex to find words starting with 'q'
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@gmail\\.com");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
