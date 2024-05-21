package Week05.Practices;

import java.util.Scanner;

public class Practice01_TryCatchBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the index: ");
        int index = input.nextInt();

        Array1 array = new Array1();

        try {
            array.elementOfArray(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}

class Array1 {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void elementOfArray(int index) {
        System.out.println("Element in the " + index + ". index is: " + this.array[index]);
    }
}
