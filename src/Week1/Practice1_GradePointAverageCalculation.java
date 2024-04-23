package Week1;

import java.util.Scanner;

public class Practice1_GradePointAverageCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Derslerden alınan not değişkenlerinin tanımlanması (defining grade variables for courses):*/

        int gradeMath, gradePhysics, gradeChemistry, gradeTurkish, gradeHistory, gradeMusic;

        /*Tanımlanan ders notu puanlarının kullanıcıdan istenmesi (requesting the defined course grade points from
         the user):*/
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

        /*Puanların toplamını (gradeSum) ve ortalamasını (gradeAverage) tutacağımız değişkenlerin tanımlanması ve
         hesaplanması (defining and calculating the variables that will hold the sum (gradeSum) and
         average (gradeAverage) of the grade points):*/
        double gradeSum, gradeAverage;
        gradeSum = gradeMath + gradePhysics + gradeChemistry + gradeTurkish + gradeHistory + gradeMusic;
        gradeAverage = gradeSum / 6;

        /*Program çıktısının oluşturulması ve kullanıcıya gösterilmesi:*/
        String message = (gradeAverage >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(message);
    }
}
