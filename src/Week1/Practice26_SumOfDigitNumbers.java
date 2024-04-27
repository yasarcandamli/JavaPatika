package Week1;

import java.util.Scanner;

public class Practice26_SumOfDigitNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, digitValue, total = 0;

        System.out.print("Basamak sayılarını toplamak istediğiniz sayıyı giriniz: ");
        number = input.nextInt();

        while (number != 0) {
            digitValue = number % 10;
            total += digitValue;
            number /= 10;
        }
        System.out.println("Sonuç = " + total);
    }
}
