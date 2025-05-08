package javaselenium.Day26_Type_Of_Exceptions;

public class Day26_Exercise5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            b=10/2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be executed always");
        }
    }
}
