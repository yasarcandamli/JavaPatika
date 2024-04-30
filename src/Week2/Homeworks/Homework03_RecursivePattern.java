package Week2.Homeworks;

import java.util.Scanner;

public class Homework03_RecursivePattern {
    static void pattern(int number) {
        if (number <= 0) {
            System.out.print(number + " ");
        } else {
            System.out.print(number + " ");
            pattern(number - 5);
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = input.nextInt();

        pattern(number);
    }
}