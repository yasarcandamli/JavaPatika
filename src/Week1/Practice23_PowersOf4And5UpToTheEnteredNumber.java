package Week1;

import java.util.Scanner;

public class Practice23_PowersOf4And5UpToTheEnteredNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boundaryNumber, i;

        System.out.print("Sınır Sayısını Giriniz: ");
        boundaryNumber = input.nextInt();

        System.out.println("4'ün Kuvvetleri: ");
        for (i = 1; i <= boundaryNumber; i *= 4) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        System.out.println("5'in Kuvvetleri: ");
        for (i = 1; i <= boundaryNumber; i *= 5) {
            System.out.println(i);
        }
    }
}
