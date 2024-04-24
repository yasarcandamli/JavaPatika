package Week1;
import java.util.Scanner;
public class Practice15_ActivitySuggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Hava Sıcaklığını Giriniz: ");
        heat = input.nextInt();

        if (heat <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
