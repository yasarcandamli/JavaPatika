package Week1;

import java.util.Scanner;

public class Practice6_AreaAndCircumference {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area, circumference;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yarıçapı giriniz: ");
        r = input.nextInt();

        area = pi * r * r;
        circumference = 2 * pi * r;

        System.out.println("Dairenin alanı: " + area);
        System.out.println("Dairenin çevresi: " + circumference);
    }
}
