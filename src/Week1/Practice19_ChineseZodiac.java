package Week1;
import java.util.Scanner;
public class Practice19_ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Definition of variables*/
        int birthYear, remainder;
        String message = "Çin Zodyağı Burcunuz: ", zodiac = "";

        /*Taking value of birth year from the user*/
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        birthYear = input.nextInt();

        /*Calculating remainder and determining the zodiac*/
        remainder = birthYear % 12;
        switch (remainder) {
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
                break;
        }

        /*Displaying the result on the screen*/
        System.out.println(message + zodiac);
    }
}
