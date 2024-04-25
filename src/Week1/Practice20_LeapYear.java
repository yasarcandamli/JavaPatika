package Week1;
import java.util.Scanner;
public class Practice20_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Definition of the variable*/
        int year;

        /*Taking the value of the variable from the user*/
        System.out.print("Lütfen yılı giriniz: ");
        year = input.nextInt();

        /*Calculating the year is eap year or not*/
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " bir artık yıldır!");
            } else {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır!");
                } else {
                    System.out.println(year + " bir artık yıl değildir!");
                }
            }
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
