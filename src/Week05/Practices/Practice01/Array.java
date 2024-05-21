package Week05.Practices.Practice01;

import java.util.Scanner;

public class Array {
    private int[] array;
    private int index;

    public Array() {
        this.array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  //Creating an array with 10 elements.
    }

    public int[] getArray() {   //Getter method of the array.
        return array;
    }

    public void setArray(int[] array) {     //Setter method of the array.
        this.array = array;
    }

    public int getIndex() {     //Getter method of the index.
        return index;
    }

    public void setIndex(int index) {       //Setter method of the index.
        this.index = index;
    }

    public void elementOfArray() {      //The method for printing the element of array in the index taking from the user.
        System.out.println("Element in the " + getIndex() + ". index is: " + getArray()[index]);
    }

    public void takeInput() {       //The method for taking the index number from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the index: ");
        setIndex(input.nextInt());
    }
}
