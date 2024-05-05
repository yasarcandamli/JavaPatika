package Week2.Practices;

import java.util.Scanner;

public class Practice11_PalindromicWordsFinder {
    static boolean isPalindrome1(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        return word.equals(reverseWord);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the word you want to query: ");
        String word = input.nextLine();

        //Enquire with first method.
        if (isPalindrome1(word)) {
            System.out.println("Your word is Palindromic!");
        } else {
            System.out.println("Your word is not Palindromic!");
        }

        //Enquire with second method.
        if (isPalindrome2(word)) {
            System.out.println("Your word is Palindromic!");
        } else {
            System.out.println("Your word is not Palindromic!");
        }
    }
}
