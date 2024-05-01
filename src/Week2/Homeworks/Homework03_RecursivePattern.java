package Week2.Homeworks;

import java.util.Scanner;

public class Homework03_RecursivePattern {
    static boolean status = false;
    static int inputNumber;
    static int pattern(int methodNumber) {
        if (status) {
            if (methodNumber == inputNumber) {
                System.out.print(methodNumber + " ");
                return methodNumber;
            }
            System.out.print(methodNumber + " ");
            return pattern(methodNumber + 5);
        } else {
            if (methodNumber <= 0) {
                status = true;
                return pattern(methodNumber);
            }
            System.out.print(methodNumber + " ");
            return pattern(methodNumber - 5);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the input number: ");
        inputNumber = input.nextInt();

        pattern(inputNumber);
    }
}