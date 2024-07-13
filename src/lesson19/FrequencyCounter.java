package lesson19;

import java.util.*;
public class FrequencyCounter {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        sentence = sentence.toLowerCase();

        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordFrequencies = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");

            if (wordFrequencies.containsKey(word)) {
                wordFrequencies.put(word, wordFrequencies.get(word) + 1);
            } else {
                wordFrequencies.put(word, 1);
            }
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
