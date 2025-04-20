package javaselenium.Day15;

import java.util.Scanner;

public class Day15_Exercise2_Vowels_Consonants {
    public static void main(String[] args) {
        String input = "Java program to count Vowels and Consonants";
        int vowels =0;
        int consonants =0;

        input = input.toLowerCase();

        for (int i =0; i<=input.length()-1; i++)
        {
            char ch = input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowels++;
            }

            else
            {
              consonants++;
            }

        }
        System.out.println("Vowels count is "+vowels);
        System.out.println("Consonants count is "+consonants);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side1");
        int s1= scan.nextInt();
        System.out.println("Enter side2");
        int s2= scan.nextInt();
        System.out.println("Enter side3");
        int s3= scan.nextInt();

        if(s1<=0 || s2<=0 || s3<=0)
        {
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        else if(s1+s2<=s3 || s1+s3<=s2 || s2+s3<=s1)
        {
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        else if(s1==s2 && s2==s3 && s1==s3)
        {
            System.out.println("This is Equilateral Triangle");
        }

        else if(s1==s2 || s2==s3 || s1==s3)
        {
            System.out.println("This is Isoceles Triangle");
        }

        else
        {
            System.out.println("This is Scalene Triangle");
        }


    }
}
