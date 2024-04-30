package Week2.Homeworks;

import java.util.Scanner;

public class Homework01_ExponentCalculationWithRecursiveMethod {
    //Method that calculating the exponantiation.
    static double exponantiation(double subNumber, double supNumber) {
        if (supNumber == 0) { //The 0th power of a number is 1.
            return 1;
        } else if (supNumber > 0) { //Calculating the exponantiation when the power is positive number.
            return subNumber * exponantiation(subNumber, (supNumber - 1));
        } else { //Calculating the exponantiation when the power is negative.
            return 1 / (subNumber * exponantiation(subNumber,- supNumber - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking the variables from the user.
        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz: ");
        double subNumber = input.nextInt();
        System.out.print("Lütfen Üs Olacak Sayıyı Giriniz: ");
        double supNumber = input.nextInt();

        //Printing the result.
        System.out.println("Sonuç = " + exponantiation(subNumber, supNumber));
    }
}
