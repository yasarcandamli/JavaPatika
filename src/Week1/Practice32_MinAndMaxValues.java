package Week1;

import java.util.Scanner;

public class Practice32_MinAndMaxValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount, min = 0, max = 0, number;
        //taking amount of numbers
        System.out.print("Girilecek Sayı Adeti: ");
        amount = input.nextInt();

        //Calculating the max and the min values accoording to condition of amount.
        if (amount == 1) {
            System.out.print("1. Sayıyı Giriniz: ");
            number = input.nextInt();
            min = number;
            max = number;
            System.out.println("En Büyük Sayı: " + max);
            System.out.println("En Küçük Sayı: " + min);
        } else if (amount <= 0) {
            System.out.println("Girilecek Sayı Adeti 0'dan Büyük Olmalıdır!");
        } else {
            for (int i = 1; i <= amount; i++) {
                System.out.print(i + ". Sayıyı Giriniz: ");
                number = input.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("En Büyük Sayı: " + max);
            System.out.println("En Küçük Sayı: " + min);
        }
    }
}
