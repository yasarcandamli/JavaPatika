package Week1;
import java.util.Scanner;
public class Practice16_SortingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1. Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("1. sayı < 2. sayı < 3. sayı");
            } else {
                System.out.println("1. sayı < 3. sayı < 2. sayı");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("2. sayı < 1. sayı < 3. sayı");
            } else {
                System.out.println("2. sayı < 3. sayı < 1. sayı");
            }
        } else {
            if (a < b) {
                System.out.println("3. sayı < 1. sayı < 2. sayı");
            } else {
                System.out.println("3. sayı < 2. sayı < 1. sayı");
            }
        }
    }
}
