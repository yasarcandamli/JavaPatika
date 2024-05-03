package Week2.Practices;

import java.util.Scanner;
import java.util.Arrays;

public class Practice07_ClosestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int biggerNumber = 0;
        int smallerNumber = 0;
        int differenceBigger = Integer.MAX_VALUE;
        int differenceSmaller = Integer.MIN_VALUE;
        int temporaryDifferenceBigger;
        int temporaryDifferenceSmaller;

        for (int i : list) {
            if (i > number) {
                temporaryDifferenceBigger = i - number;
                if (temporaryDifferenceBigger < differenceBigger) {
                    biggerNumber = i;
                    differenceBigger = temporaryDifferenceBigger;
                }
            } else if (i < number) {
                temporaryDifferenceSmaller = i - number;
                if (temporaryDifferenceSmaller > differenceSmaller) {
                    smallerNumber = i;
                    differenceSmaller = temporaryDifferenceSmaller;
                }
            }
        }

        Arrays.sort(list);
        System.out.println((Arrays.binarySearch(list, biggerNumber) < 0 ? "Daha büyük bir sayı bulunmamaktadır." : ("Girilen Sayıdan Büyük En Yakın Değer: " + biggerNumber)));
        System.out.println((Arrays.binarySearch(list, smallerNumber) < 0 ? "Daha küçük bir sayı bulunmamaktadır." : ("Girilen Sayıdan Küçük En Yakın Değer: " + smallerNumber)));
    }
}
