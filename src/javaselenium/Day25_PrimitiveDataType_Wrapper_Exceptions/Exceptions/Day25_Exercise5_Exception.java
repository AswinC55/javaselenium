package javaselenium.Day25_PrimitiveDataType_Wrapper_Exceptions.Exceptions;

public class Day25_Exercise5_Exception {
    public static void main(String[] args) {

        System.out.println("Start of the program");
        String a = args[0];   // java.lang.ArrayIndexOutOfBoundsExceptio
        int input = Integer.parseInt(a);    // java.lang.NumberFormatException: For input string
        int output = 100/input;      // java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of the program");


        // divide by zero -> ?

        // java.lang.ArithmeticException: / When we give input as zero(0) we can't divide using 0
        // java.lang.NumberFormatException: When input is given as string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds . When the input is not given

    }
}
