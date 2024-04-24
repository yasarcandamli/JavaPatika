package Week1;

import java.util.Scanner;

public class Practice10_ArithmeticOperationsAndOperationPrecedence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, result;

        System.out.print("1. Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        c = input.nextInt();

        result = a + b * c - b;
        System.out.println("İşlem Sonucu: " + result);
    }
}
