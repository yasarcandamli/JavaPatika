package Week1;

import java.util.Scanner;

public class Practice12_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, select, result;

        System.out.print("1. Sayıyı Giriniz: ");
        number1 = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        number2 = input.nextInt();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                result = number1 + number2;
                System.out.println("İşleminizin Sonucu: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("İşleminizin Sonucu: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("İşleminizin Sonucu: " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("İşleminizin Sonucu: " + result);
                } else {
                    System.out.println("Sayı 0'a Bölünemez!");
                }
                break;
            default:
                System.out.println("Geçersiz İşlem, Tekrar Deneyiniz!");
        }
    }
}
