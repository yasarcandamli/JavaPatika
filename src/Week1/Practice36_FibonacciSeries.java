package Week1;

import java.util.Scanner;

public class Practice36_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Defining the variables.
        int firstNumber = 0, secondNumber = 1, number, elementNumber;

        //Taking the element number from the user.
        System.out.print("Lütfen Fibonacci Serisinin Eleman Sayısını Giriniz: ");
        elementNumber = input.nextInt();

        //Calculating and printing the fibonacci series
        for (int counter = 1; counter <= elementNumber; counter++) {
            System.out.print(firstNumber + " ");
            number = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = number;
        }
    }
}
