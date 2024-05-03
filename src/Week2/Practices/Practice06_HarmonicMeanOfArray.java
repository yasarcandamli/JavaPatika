package Week2.Practices;

public class Practice06_HarmonicMeanOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicMean = 0;
        for (int i : numbers) {
            harmonicMean += (double) 1/i;
        }
        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
