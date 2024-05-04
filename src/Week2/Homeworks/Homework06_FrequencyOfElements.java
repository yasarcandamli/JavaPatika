package Week2.Homeworks;

public class Homework06_FrequencyOfElements {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] isCounted = new boolean[list.length];

        System.out.println("Number of Repetitions: ");
        for (int i = 0; i < list.length; i++) {
            int counter = 1;
            if (!isCounted[i]) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        counter++;
                        isCounted[j] = true;
                    }
                }
                isCounted[i] = true;
                System.out.println("The number " + list[i] + " repeated " + counter + " times.");
            }
        }
    }
}
