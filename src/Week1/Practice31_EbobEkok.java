package Week1;

import java.util.Scanner;

public class Practice31_EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, min;
        System.out.print("1. Sayıyı Giriniz: ");
        number1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        number2 = input.nextInt();

        min = Math.min(number1, number2);

        int divider = min;
        int ebob = 1;
        while (divider >= 1) {
            if ((number1 % divider == 0) && (number2 % divider == 0)) {
                ebob = divider;
                break;
            }
            divider--;
        }
        System.out.println("EBOB = " + ebob);

        int multiple = 1;
        int ekok1 = 1;
        while (multiple <= (number1 * number2)) {
            if ((multiple % number1 == 0) && (multiple % number2 == 0)) {
                ekok1 = multiple;
                break;
            }
            multiple++;
        }
        System.out.println("EKOK = " + ekok1);

        //2. method of EKOK:
        /*int ekok2 = (number1 * number2) / ebob;
        System.out.println("EKOK = " + ekok2);*/
    }
}
