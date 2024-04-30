package Week2.Practices;

import java.util.Scanner;

public class Practice02_Fibonacci {
    static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Serisinde Kaçıncı Elemanı Bulmak İstediğinizi Giriniz: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Lütfen 0'dan Büyük Bir Sayı Giriniz!");
        } else {
            System.out.println(number + ". Eleman: " + fibonacci(number));
        }
    }
}
