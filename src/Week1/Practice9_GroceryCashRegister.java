package Week1;

import java.util.Scanner;

public class Practice9_GroceryCashRegister {
    public static void main(String[] args) {
        double pearUnitPrice = 2.14, appleUnitPrice = 3.67, tomatoUnitPrice = 1.11, bananaUnitPrice = 0.95,
                eggplantUnitPrice = 5;
        double pearWeight, appleWeight, tomatoWeight, bananaWeight, eggplantWeight;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        pearWeight = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        appleWeight = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        tomatoWeight = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        bananaWeight = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        eggplantWeight = input.nextDouble();

        double total = (pearUnitPrice * pearWeight) + (appleUnitPrice * appleWeight) + (tomatoUnitPrice * tomatoWeight) +
                (bananaUnitPrice * bananaWeight) + (eggplantUnitPrice * eggplantWeight);

        System.out.println("Toplam Tutar: " + total + " TL");
    }
}
