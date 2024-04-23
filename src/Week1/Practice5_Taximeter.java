package Week1;

import java.util.Scanner;

public class Practice5_Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, perKm, startPrice, total;

        perKm = 2.20;
        startPrice = 10;

        System.out.println("Lütfen KM'yi Giriniz: ");
        km = input.nextDouble();

        if (km < 0) {
            System.out.println("Lütfen KM bilgisini 0'dan büyük giriniz!");
            return;
        } else if (km * perKm + startPrice < 20) {
            total = 20;
        } else {
            total = km * perKm + startPrice;
        }

        System.out.println("Toplam tutar: " + total);
    }
}
