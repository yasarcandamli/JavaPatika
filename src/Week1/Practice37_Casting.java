package Week1;

import java.util.Scanner;

public class Practice37_Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Defining the variables.
        int intNumber, newIntNumber;
        double doubleNumber, newDoubleNumber;

        //Taking the values of the variables from the user.
        System.out.print("Integer tipinde bir sayı giriniz: ");
        intNumber = input.nextInt();
        System.out.print("Double tipinde bir sayı giriniz: ");
        doubleNumber = input.nextDouble();

        //Type casting.
        newIntNumber = (int) doubleNumber;
        newDoubleNumber = intNumber;

        //Output.
        System.out.println("Integer tipindeki sayının double tipine dönüştürülmüş hali:  " + newDoubleNumber);
        System.out.println("Double tipindeki sayının integer tipine dönüştürülmüş hali:  " + newIntNumber);
    }
}
