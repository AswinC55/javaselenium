package javaselenium.Day26_Type_Of_Exceptions;

public class Day26_Exercise4 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        try {
            b=10/a;  // Vulnerable Code that should be in try and catch!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
