package javaselenium.Day26_Type_Of_Exceptions;

import java.util.Scanner;

public class Day26_Exercise6 {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int a = sc.nextInt();

        try {
            int b=10/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("End of Program");
        }

    }
}
