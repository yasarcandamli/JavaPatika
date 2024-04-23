package Week1;

import java.util.Scanner;

public class Practice1_GradePointAverageCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeMath, gradePhysics, gradeChemistry, gradeTurkish, gradeHistory, gradeMusic;

        System.out.println("Matematik Sınav Puanını Giriniz: ");
        gradeMath = input.nextInt();

        System.out.println("Fizik Sınav Puanını Giriniz: ");
        gradePhysics = input.nextInt();

        System.out.println("Kimya Sınav Puanını Giriniz: ");
        gradeChemistry = input.nextInt();

        System.out.println("Türkçe Sınav Puanını Giriniz: ");
        gradeTurkish = input.nextInt();

        System.out.println("Tarih Sınav Puanını Giriniz: ");
        gradeHistory = input.nextInt();

        System.out.println("Müzik Sınav Puanını Giriniz: ");
        gradeMusic = input.nextInt();

        double gradeSum, gradeAverage;
        gradeSum = gradeMath + gradePhysics + gradeChemistry + gradeTurkish + gradeHistory + gradeMusic;
        gradeAverage = gradeSum / 6;

        String message = (gradeAverage >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(message);
    }
}
