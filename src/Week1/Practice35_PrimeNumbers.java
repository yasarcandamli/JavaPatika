package Week1;

public class Practice35_PrimeNumbers {
    public static void main(String[] args) {
        //Defining the variables.
        int number, divider, lastNumber = 100;
        boolean isPrime = true;

        //Loop from 2 to 100.
        for (number = 2; number <= lastNumber; number++) {
            //Divide the number from 2 to (number-1).
            for (divider = 2; divider < number; divider++){
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
