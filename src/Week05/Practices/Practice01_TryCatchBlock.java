package Week05.Practices;

public class Practice01_TryCatchBlock {
    public static void main(String[] args) {
        Array array = new Array();
        array.takeInput();

        try {
            array.elementOfArray();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}