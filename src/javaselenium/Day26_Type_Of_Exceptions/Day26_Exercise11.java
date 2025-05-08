package javaselenium.Day26_Type_Of_Exceptions;

import java.util.Scanner;

public class Day26_Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void validateAge(int age) throws NumberFormatException, ArithmeticException, Exception {
        if(age <18)
        {
            throw new Exception("You can't go to Goa");
        }

    }


}
