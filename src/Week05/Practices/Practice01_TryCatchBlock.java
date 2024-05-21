package Week05.Practices;

public class Practice01_TryCatchBlock {
    public static void main(String[] args) {
        Array array = new Array();  //creating object from the Array class
        array.takeInput();  //Running the method to take input from the user

        try {   //Try-Catch block
            array.elementOfArray();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}