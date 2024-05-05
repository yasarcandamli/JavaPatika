package Week2.Practices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice10_GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        int right = 0;
        int userNumber;
        int[] wrongNumbers = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Please, enter your guess: ");
            userNumber = input.nextInt();

            if (userNumber < 0 || userNumber > 99) {
                System.out.println("Please, enter your guess between 0 - 100!");
                if (isWrong) {
                    right++;
                    System.out.println("Entered too many numbers out of range. Remaining right: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your right will be deducted the next time you enter a number out of range!");
                }
                continue;
            }

            if (userNumber == randomNumber) {
                System.out.println("Congrats, correct guess! The number you guessed: " + randomNumber);
                isWin = true;
                break;
            } else {
                System.out.println("You entered wrong number!");
                if (userNumber > randomNumber) {
                    System.out.println(userNumber + " is greater than secret number.");
                } else {
                    System.out.println(userNumber + " is less than secret number.");
                }

                wrongNumbers[right++] = userNumber;
                System.out.println("Remaining right: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Game Over! Secret Number: " + randomNumber);
            if (!isWrong) {
                System.out.println("Your guesses: " + Arrays.toString(wrongNumbers));
            }
        }
    }
}
