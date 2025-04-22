package javaselenium.Day16_Arrays;

import java.util.Arrays;

public class Day16_Exercise1 {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {90, 91, 92, 93, 96, 99, 100};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        // System.out.println(marks[-1]); // ArrayIndexOutOfBoundsException
        // System.out.println(marks[10]); // ArrayIndexOutOfBoundsException

        char c = 'A';
        String name = "Pramod";


        int[] marks1 = new int[5];
        String marks2[] = new String[5];

        String[] names = new String[3];
        names[0] = "Pramod";
        names[1] = "Vinoth";
        names[2] = "Aswin";

        System.out.println(names);
        System.out.println(names[2]);
        System.out.println(names.length);

        int marks3[] = {51, 100, 91, 87, 90};
        System.out.println(marks3[0]);
        System.out.println(marks3[1]);
        System.out.println(marks3[2]);
        System.out.println(marks3[3]);
        System.out.println(marks3[4]);

        Arrays.sort(marks3);

        System.out.println("---------");

        for (int i = 0; i <= marks3.length - 1; i++) {
            System.out.println(marks3[i]);
        }
        System.out.println("------");

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max_output = give_me_max(array);
        int min_output = give_me_min(array);


        int max = array[0];

        for (int i = 0; i <= array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println(max_output);
        System.out.println(min_output);


    }

    static int give_me_min(int[] array) {

        int min = array[0];

        for(int i=0; i<=array.length-1; i++)
        {
            if(array[i]<min)
                min=array[i];

        }

        return min;
    }


    static int give_me_max(int[] array) {

        int max = array[0];

        for (int i = 0; i <= array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
