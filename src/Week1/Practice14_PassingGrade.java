package Week1;
import java.util.Scanner;
public class Practice14_PassingGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, turkish, chemistry, music;
        int counter = 0, totalGrade = 0;
        double average;

        System.out.print("Matematik Notunuz: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100) {
            counter++;
            totalGrade += math;
        }


        System.out.print("Fizik Notunuz: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            counter++;
            totalGrade += physics;
        }

        System.out.print("Türkçe Notunuz: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            counter++;
            totalGrade += turkish;
        }

        System.out.print("Kimya Notunuz: ");
        chemistry = input.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            counter++;
            totalGrade += chemistry;
        }

        System.out.print("Müzik Notunuz: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            counter++;
            totalGrade += music;
        }

        if (counter > 0) {
            average = totalGrade / counter;
            System.out.println("Ortalamanız: " + average);
            if (average <= 55) {
                System.out.println("Kaldınız!");
            } else {
                System.out.println("Geçtiniz!");
            }
        } else {
            System.out.println("Girilen notlar 0-100 aralığında değildir!");
        }
    }
}
