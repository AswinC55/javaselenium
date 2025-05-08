package javaselenium.Day26_Type_Of_Exceptions;

public class Day26_Exercise1 {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a=10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("2");
    }
}
