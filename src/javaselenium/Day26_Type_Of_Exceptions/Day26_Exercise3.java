package javaselenium.Day26_Type_Of_Exceptions;

public class Day26_Exercise3 {
    public static void main(String[] args) {

        try {
            String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
            int output = 100/a; //ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
            // new NumberFormatException (); JVM is creating the object
            System.out.println(e.getMessage());
        }
    }
}
