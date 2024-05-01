package Week2.Homeworks;

import java.util.Scanner;

public class Homework03_RecursivePattern {
    static boolean status = true;
    static int inputNumber;
    static int pattern(int methodNumber) {
        if (status) { //Recursive method works until status became false.
            if (methodNumber <= 0) {
                status = false; //Status became false when the method number is 0 or negative.
                return pattern(methodNumber);
            }
            System.out.print(methodNumber + " ");
            return pattern(methodNumber - 5); //Minus 5 until method number is 0 or negative.
        } else { //when status became false, we need to add 5 to method number because the turning point of the pattern has been reached.
            if (methodNumber == inputNumber) { //If method number equals to the input number program should stop.
                System.out.print(methodNumber + " ");
                return inputNumber;
            }
            System.out.print(methodNumber + " ");
            return pattern(methodNumber + 5);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the input number: ");
        inputNumber = input.nextInt();

        pattern(inputNumber);
    }
}