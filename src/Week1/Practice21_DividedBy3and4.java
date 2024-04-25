package Week1;

import java.util.Scanner;

public class Practice21_DividedBy3and4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, sum = 0, counter = 0, average;

        System.out.println("Sayı Giriniz: ");
        j = input.nextInt();

        System.out.print("3'e ve 4'e bölünen sayılar: ");
        for (i = 1; i < j; i++) {
            if ((i % 3 == 0) && (i % 4 ==0)) {
                System.out.print(i + ", ");
                sum += i;
                counter++;
            }
        }

        System.out.println(); //Alt satıra geçmek için

        average = sum / counter;
        System.out.println("Sayıların toplamı: " + sum);
        System.out.println("Sayıların sayısı: " + counter);
        System.out.println("Sayıların ortalaması: " + average);
    }
}
