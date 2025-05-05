package javaselenium.Day25_PrimitiveDataType_Wrapper_Exceptions.Exceptions;

public class Day25_Exercise8_Exception_TryandCatch {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a=10/0;
        } catch (ArithmeticException e) {
            System.out.println("Are you Fool");
        }
        System.out.println("2");
    }
}
