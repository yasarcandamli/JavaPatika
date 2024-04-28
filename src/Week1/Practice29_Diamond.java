package Week1;

import java.util.Scanner;

public class Practice29_Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, counter1, counter2, counter3, counter4, counter5, counter6;
        System.out.print("Basamak sayısını giriniz: ");
        number1 = input.nextInt();
        number2 = number1 / 2;
        
        for (counter1 = 1; counter1 <= number2; counter1++) {
            for (counter2 = 1; counter2 <= (number2 - counter1); counter2++) {
                System.out.print(" ");
            }
            for (counter3 = 1; counter3 <= (2 * counter1 - 1); counter3++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (counter4 = number2; counter4 > 0; counter4--) {
            for (counter5 = 0; counter5 < number2 - counter4; counter5++) {
                System.out.print(" ");
            }
            for (counter6 = 2 * counter4 - 1; counter6 > 0; counter6--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
