package javaselenium.Day16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scan.nextInt();

        int[] array = new int[size];

        for(int i=0; i<=array.length-1; i++)
        {
            int a=i+1;
            System.out.println("Enter the input for "+a);
            array[i] = scan.nextInt();
        }

        for (int i=0; i<=array.length-1;i++)
        {
            System.out.println(array[i]);
        }

        scan.close();

        System.out.println("-----");

        int[] reverse = {1,2,3,4,5};

        for(int i=reverse.length-1; i>=0; i--)
        {
            System.out.println(reverse[i]);
        }

        System.out.println("-----");

        int[] numbers = {12, 34, 10};
        int sum=0;

        for(int i=0; i<=numbers.length-1; i++)
        {
            sum=sum+numbers[i];
        }
        System.out.println("The sum is "+sum);

        System.out.println("For each loop");

        int sum2 =0;
        for(int n:numbers)
        {
            sum2=sum2+n;
        }
        System.out.println(sum2);

        System.out.println("----");

        int[] numbers2 = {12,34,10,1,100,3,4,32};

        System.out.println(numbers2[numbers2.length-2]);
        Arrays.sort(numbers2);
        System.out.println("2nd Highest- "+numbers2[numbers2.length-2]);
        System.out.println("Minimum- "+numbers2[0]);
        System.out.println("2nd Minimum- "+numbers2[1]);
    }
}
