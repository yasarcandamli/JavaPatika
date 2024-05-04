package Week2.Homeworks;

import java.util.Scanner;

public class Homework07_TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking the number of rows and columns from the user
        System.out.print("Please, enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Please, enter the number of columns: ");
        int column = input.nextInt();

        //Defining the matrix and transpose
        int[][] matrix = new int[row][column];
        int[][] transpose = new int[column][row];

        //Creating the matrix with the numbers entered by the user.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please, enter the [" + i + "]" + "[" + j + "]th element of matrix: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println(); //One line space.
        System.out.println("Matrix: ");
        //Printing the matrix on the screen
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Creating the transpose using the matrix.
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println(); //One line space.
        System.out.println("Transpose of the Matrix: ");
        //Printing the transpose on the screen
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
