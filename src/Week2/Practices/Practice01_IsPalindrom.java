package Week2.Practices;

import java.util.Scanner;

public class Practice01_IsPalindrom {
    static boolean isPalindrom(int number) {
        int temporaryNumber = number, reverseNumber = 0, lastNumber;

        while (temporaryNumber != 0) {
            lastNumber = temporaryNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temporaryNumber /= 10;
        }

        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sorgulamak istediğiniz sayıyı giriniz: ");
        int number = input.nextInt();

        System.out.println(isPalindrom(number));
    }
}
