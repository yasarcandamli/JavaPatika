package Week06.Practices.Practice01;

import java.io.*;

public class Practice01_ReadingAndAddingNumbersFromFile {
    public static void main(String[] args) {
        int sum = 0;

        try {
            FileReader fileReader = new FileReader("./src/Week06/Practices/Practice01/Numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
            }
            System.out.println(sum);

            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
