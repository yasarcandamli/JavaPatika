package Week1;

import java.util.Scanner;

public class Practice8_BodyMassIndex {
    public static void main(String[] args) {
        double height, weight, index;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre (m) cinsinden giriniz: ");
        height = input.nextDouble();

        System.out.print("Kilonuzu kilogram (kg) cinsinden giriniz: ");
        weight = input.nextDouble();

        index = weight / (height * height);

        System.out.println("Vücut Kitle Endeksiniz: " + index);
    }
}
