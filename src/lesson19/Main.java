package lesson19;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> regions = new Hashtable<>();
        regions.put(1, "Abseron");
        regions.put(2,"Agdam");
        regions.put(3,"Agdas");
        regions.put(10,"Baki");
        regions.put(14,"Jabrail");
        regions.put(50, "Sumqayit");


        for (Map.Entry<Integer, String> entry : regions.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
