package Week1;

import java.util.Scanner;

public class Practice27_IsItArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sorgulamak İstediğiniz Sayıyı Giriniz: ");
        int number = input.nextInt();
        int digitNumber = 0;
        int temporaryNumber = number;
        int digitValue;
        int result = 0;
        int digitPower;

        while (temporaryNumber != 0) {
            temporaryNumber /= 10;
            digitNumber++;
        }

        temporaryNumber = number;
        while (temporaryNumber != 0) {
            digitValue = temporaryNumber % 10;
            digitPower = 1;
            for (int i = 1; i <= digitNumber; i++) {
                digitPower *= digitValue;
            }
            result += digitPower;
            temporaryNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
    }
}


