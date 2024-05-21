package Week05.Practices;

import java.util.Scanner;

public class Array {
    private int[] array;
    private int index;

    public Array() {
        this.array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void elementOfArray() {
        System.out.println("Element in the " + getIndex() + ". index is: " + getArray()[index]);
    }

    public void takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the index: ");
        setIndex(input.nextInt());
    }
}
