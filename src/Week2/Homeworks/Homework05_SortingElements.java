package Week2.Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05_SortingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the array's length: ");
        int listLength = input.nextInt();

        int[] list = new int[listLength];


        for (int i = 0; i < list.length; i++) {
            System.out.print("Please enter the " + (i + 1) + ". element of the array: ");
            list[i] = input.nextInt();
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
