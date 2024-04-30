package Week2.Practices;

import java.util.Scanner;

public class Practice02_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Serisinde Kaçıncı Elemanı Bulmak İstediğinizi Giriniz: ");
        int number = input.nextInt();

        System.out.println(number + ". Eleman: " + fibonacci(number));
    }

    static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
