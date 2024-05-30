package Week06.Practices.Practice01;

import java.io.*;

public class Practice01_ReadingAndAddingNumbersFromFile {
    public static void main(String[] args) {
        int sum = 0;

        try {
            FileReader fileReader = new FileReader("./src/Week06/Practices/Practice01/Numbers.txt"); //Reading the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) { //Reading the lines in the file and adding up the every line in integer data type
                int number = Integer.parseInt(line);
                sum += number;
            }

            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total: " + sum); //Printing the sum
    }
}
