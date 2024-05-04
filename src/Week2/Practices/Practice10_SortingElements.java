package Week2.Practices;

import java.util.Arrays;
import java.util.Scanner;

public class Practice10_SortingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the array's length: ");
        int listLength = input.nextInt();

        int[] list = new int[listLength];

        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
