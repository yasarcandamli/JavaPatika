package Week2.Practices;

import java.util.Scanner;

public class Practice03_AdvancedCalculator {
    static void addition() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void substraction() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void multiplicaiton() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1) break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void exponentiation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Modu Alınacak Sayıyı Giriniz: ");
        int number1 = input.nextInt();
        System.out.print("Mod Alacak Sayıyı Giriniz: ");
        int number2 = input.nextInt();

        int result = number1 % number2;
        System.out.println("Sonuç: " + result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        int edge1 = input.nextInt();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        int edge2 = input.nextInt();

        int perimeter = 2 * (edge1 + edge2);
        int area = edge1 * edge2;

        System.out.println("Dikdörtgenin Çevresi: " + perimeter);
        System.out.println("Dikdörtgenin Alanı: " + area);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme işlemi\n5- Üslü Sayı Hesaplama\n6- Faktoriyel Hesaplama\n7- Mod Alma\n8- Dikdörtgen Alan ve Çevre Hesabı\n0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    substraction();
                    break;
                case 3:
                    multiplicaiton();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponentiation();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
