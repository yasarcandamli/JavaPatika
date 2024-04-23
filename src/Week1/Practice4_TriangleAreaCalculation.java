package Week1;

import java.util.Scanner;

public class Practice4_TriangleAreaCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double edge1, edge2, edge3, halfPerimeter, area;

        System.out.println("1. kenar uzunluğunu giriniz: ");
        edge1 = input.nextDouble();

        System.out.println("2. kenar uzunluğunu giriniz: ");
        edge2 = input.nextDouble();

        System.out.println("3. kenar uzunluğunu giriniz: ");
        edge3 = input.nextDouble();

        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
            System.out.println("Lütfen Kenar Uzunluklarını 0'dan Büyük Giriniz!");
        }

        halfPerimeter = (edge1 + edge2 + edge3) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - edge1) * (halfPerimeter - edge2) * (halfPerimeter - edge3));
        System.out.println("Üçgenin ALlanı: " + area);
    }
}
