package javaselenium.Day15;

import java.util.Scanner;

public class Day15_Exercise1 {
    public static void main(String[] args) {

        String s0 = "Pramod";
        String s1 = new String("Pramod");
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        StringBuffer sb = new StringBuffer("Pramod");
        sb.append(123);
        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.reverse();
        System.out.println(sb);

        String s2 = "Hello";
        String s3 = "123";
        String s4 = s2 + s3;
        System.out.println(s4);

        StringBuilder sr = new StringBuilder("Pramod");
        sr.append(123);
        System.out.println(sr);
        System.out.println();

        StringBuffer sa = new StringBuffer("Java");
        sa.append(" Programming");
        System.out.println(sa);
        sa.delete(4, 16);
        System.out.println(sa);
        sa.replace(0, 4, "C++");
        System.out.println(sa);

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string to check if it is Palindrome");
        String input = scan.next();
        String reverse_input = palindrome(input);
        System.out.println("Reverse value is "+ reverse_input);
        if(reverse_input.equalsIgnoreCase(input))
        {
            System.out.println("It's a palindrome");
        }
        else
        {
            System.out.println("It's not a palindrome");
        }
    }

    private static String palindrome(String input) {
        String reverse = "";
        for(int i=input.length()-1; i>=0; i--)
        {
            reverse = reverse+input.charAt(i);

        }
        return reverse; */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string to check if it is Palindrome");
        String input = scan.next();

        /* String reverse = "";
        for(int i=input.length()-1; i>=0; i--)
        {
            reverse = reverse+input.charAt(i);

        }


        String reverse_input = reverse;
        System.out.println("Reverse value is "+ reverse_input);
        if(reverse_input.equalsIgnoreCase(input))
        {
            System.out.println("It's a palindrome");
        }
        else
        {
            System.out.println("It's not a palindrome");
        } */

        StringBuilder sc = new StringBuilder(input);
        sc.reverse();
        System.out.println(sc);
        String a=reverseStringsb(input);
        System.out.println(a);
    }


    private static String reverseStringsb(String input){
            StringBuilder sd = new StringBuilder(input);
            return sd.reverse().toString();
    }

}
