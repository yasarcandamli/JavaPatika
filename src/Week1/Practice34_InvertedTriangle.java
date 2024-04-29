package Week1;

import java.util.Scanner;

public class Practice34_InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Defining the variables.
        int stepNumber, counter1, counter2;

        //Taking the step number from the user.
        System.out.print("Basamak sayısını giriniz: ");
        stepNumber = input.nextInt();

        //Printing the inverted triangle.
        for (counter1 = stepNumber; counter1 > 0; counter1--) {
            for (counter2 = counter1 * 2 - 1; counter2 > 0; counter2--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
