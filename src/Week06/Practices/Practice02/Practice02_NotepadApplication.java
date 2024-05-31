package Week06.Practices.Practice02;

import java.io.*;
import java.util.Scanner;

public class Practice02_NotepadApplication {
    private static final String notesPath = "./src/week06/Practices/Practice02/Notes.txt";

    //Reading the text
    private static void readFile() {
        try {
            FileReader fileReader = new FileReader(notesPath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);

            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Writing the text to Notes.txt
    private static void writeToFile() {
        //Taking the text that the user wants to save
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the text you want to save: ");
        String text = input.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(notesPath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);

            fileWriter.close();
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.print("Last saved text: ");
        readFile(); //Reading the text inside the file
        writeToFile(); //Writing the text to Notes.txt
        System.out.print("The text you saved: ");
        readFile(); //Reading the text that written by the user
    }
}
