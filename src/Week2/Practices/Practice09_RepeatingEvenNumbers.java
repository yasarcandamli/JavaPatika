package Week2.Practices;

public class Practice09_RepeatingEvenNumbers {
    static boolean isFind (int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 4, 33, 9, 1, 8, 6, 4, 46, 7, 6, 8, 8, 15};
        int[] duplicateEven = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicateEven, list[i])) {
                        duplicateEven[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicateEven) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
