package Week1;

import java.util.Scanner;

public class Practice24_CalculatingFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double N, R, i, factorialN = 1, factorialR = 1, factorialNR = 1, combination;

        System.out.println("C(N, R): N'in R'li Kombinasyonunu Hesaplama Programına Hoşgeldiniz.");

        System.out.print("N'yi giriniz: ");
        N = input.nextInt();

        System.out.print("R'yi giriniz: ");
        R = input.nextInt();

        for (i = 1; i <= N; i++) {
            factorialN *= i;
        }

        for (i = 1; i <= R; i++) {
            factorialR *= i;
        }

        for (i = 1; i <= (N - R); i++) {
            factorialNR *= i;
        }

        combination = factorialN / (factorialR * factorialNR);
        System.out.println("İşlem Sonucu: " + combination);

    }
}
