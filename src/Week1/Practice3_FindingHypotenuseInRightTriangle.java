package Week1;

import java.util.Scanner;

public class Practice3_FindingHypotenuseInRightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perpendecularEdge1, perpendecularEdge2, hypotenuse;

        System.out.println("1. Dik Kenarı Giriniz: ");
        perpendecularEdge1 = input.nextDouble();

        System.out.println("2. Dik Kenarı Giriniz: ");
        perpendecularEdge2 = input.nextDouble();

        if (perpendecularEdge1 <= 0 || perpendecularEdge2 <= 0) {
            System.out.println("Lütfen kenar uzunluklarını 0'dan büyük giriniz!");
            return;
        } else {
            hypotenuse = Math.sqrt((perpendecularEdge1 * perpendecularEdge1) + (perpendecularEdge2 * perpendecularEdge2));
            System.out.println("Hipotenüs uzunluğu: " + hypotenuse);
        }
    }
}
