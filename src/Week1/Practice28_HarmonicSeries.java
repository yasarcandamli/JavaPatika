package Week1;

import java.util.Scanner;

public class Practice28_HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number, counter, result = 0;
        double fractionalNumber;
        System.out.print("Lütfen Sorgulamak İstediğiniz Sayıyı Giriniz: ");
        number = input.nextInt();


        for (counter = 1; counter <= number; counter++) {
            fractionalNumber = 1 / counter;
            result += fractionalNumber;
        }

        System.out.println("Sonuç = " + result);
    }
}
