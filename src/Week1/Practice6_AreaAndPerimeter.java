package Week1;

import java.util.Scanner;

public class Practice6_AreaAndPerimeter {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yarıçapı giriniz: ");
        r = input.nextInt();

        System.out.print("Lütfen merkez açı ölçüsünü giriniz: ");
        a = input.nextInt();

        area = pi * r * r * a / 360;
        System.out.print("Daire diliminin alanı: " + area);
    }
}
