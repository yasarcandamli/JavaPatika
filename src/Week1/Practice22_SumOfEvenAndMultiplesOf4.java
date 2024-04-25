package Week1;

import java.util.Scanner;

public class Practice22_SumOfEvenAndMultiplesOf4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        do {
            System.out.print("Sayı Giriniz: ");
            number = input.nextInt();
            if (number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);

        System.out.println("Toplam = " + sum);

    }
}
