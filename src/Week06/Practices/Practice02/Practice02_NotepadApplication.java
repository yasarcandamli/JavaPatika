package Week06.Practices.Practice02;

import java.io.*;
import java.util.Scanner;

public class Practice02_NotepadApplication {
    public static void main(String[] args) {
        String notesPath = "./src/week06/Practices/Practice02/Notes.txt";
        //Reading the last saved text
        try {
            FileReader fileReader = new FileReader(notesPath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println("Last saved text: " + line);

            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Taking the text that the user wants to save
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the text you want to save: ");
        String text = input.nextLine();

        //Writing the text to Notes.txt
        try {
            FileWriter fileWriter = new FileWriter(notesPath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);

            fileWriter.close();
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Reading the text written by the user
        try {
            FileReader fileReader = new FileReader(notesPath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println("The text you saved: " + line);

            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
