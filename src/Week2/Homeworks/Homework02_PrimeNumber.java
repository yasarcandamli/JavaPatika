package Week2.Homeworks;

import java.util.Scanner;

public class Homework02_PrimeNumber {
    static boolean isPrime(int number, int divider) {
        if (number <= 2) return number == 2; //If the number is 2, it is prime, if it is less than 2, it is not prime.
        if (divider == 1) return true; //If divider is just one, it is prime.
        if (number % divider == 0) return false; //If the remainder is 0, it is not prime.
        return isPrime(number, divider - 1); //Recursive
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sorgulamak İstediğiniz Sayıyı Giriiniz: ");
        int number = input.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL DEĞİLDİR!");
        }
    }
}
