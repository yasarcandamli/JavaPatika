package Week1;

import java.util.Scanner;

public class Practice33_PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0, counter = 1;

        //Taking the number from the user.
        System.out.print("Sorgulamak İstediğiniz Sayıyı Giriniz: ");
        number = input.nextInt();

        //Determining is the number a perfect number or not according to the conditions. if number is 1 or less, it isn't a perfect number.
        //This program returns a perfect number when this condition is omitted and the number is entered as 1
        if (number <= 1) {
            System.out.println(number + " Mükemmel Sayı Değildir.");
        } else {
            while (counter < number) {
                if (number % counter == 0) {
                    sum += counter;
                }
                counter++;
            }

            if (number == sum) {
                System.out.println(number + " Mükemmel Sayıdır.");
            } else {
                System.out.println(number + " Mükemmel Sayı Değildir.");
            }
        }
    }
}
