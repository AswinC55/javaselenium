package javaselenium.Day17_MD_Arrays;

import java.util.Scanner;

public class Day17_Exercise1 {
    public static void main(String[] args) {

        int[][] array_2d_old = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] predefined = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] array;
        array = new int[][]{{1,2},{3,4},{5,6}};

        int[][] array_2d = new int[3][3];
        array_2d[0][0]=1;
        array_2d[0][1]=2;
        array_2d[0][2]=3;
        array_2d[1][0]=4;
        array_2d[1][1]=5;
        array_2d[1][2]=6;
        array_2d[2][0]=7;
        array_2d[2][1]=8;
        array_2d[2][2]=9;

        int[][] jagged_array = {
                {1,2,3},
                {4,5,6,7},
                {9}
        };

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix[1][1]);

        for(int i=0; i<= matrix.length-1; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+" | ");
            }
            System.out.println();
        }


        System.out.println("Right Angle Triangle");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n value");
        int n= scan.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Left angle Triangle");
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Matrix Multiplication");
        System.out.println("Enter the size of array");
        int size = scan.nextInt();

        for(int i=0; i<size; i++)
        {
            for (int j=0; j<size; j++)
            {
                //System.out.print(i+"x"+j+"=" +i*j+ "\t");
                System.out.print(i*j+ "\t");
            }
            System.out.println();
        }

        System.out.println("Left angle Triangle");
        System.out.println("Enter input");
        int k =scan.nextInt();

        for(int i=k; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
