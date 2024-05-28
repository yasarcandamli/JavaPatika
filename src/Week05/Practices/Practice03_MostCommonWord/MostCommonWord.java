package Week05.Practices.Practice03_MostCommonWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostCommonWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String userInput = input.nextLine();

        //Creating a HashMap to store words and their numbers
        HashMap<String, Integer> wordMap = new HashMap<>();

        //Separating the text according to gaps
        String[] words = userInput.split(" ");

        //Searching word from HashMap
        for (String word : words) {
            Integer count = wordMap.get(word);
            //If the word is not in the HashMap, initialise to 1, if it is present, increment by one
            if (count == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, count + 1);
            }
        }

        //Printing the result for all words
        for (String word : wordMap.keySet()) {
            System.out.println(word + ": " + wordMap.get(word));
        }

        //Finding the most common word and its number
        String mostCommonWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommonWord = entry.getKey();
            }
        }

        //Printing the result
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.println("En çok geçen kelime: " + mostCommonWord + "\nSayısı: " + maxCount);
    }
}
