package javaselenium.Day28_ArrayList_LinkedList_Vector;

import java.util.ArrayList;
import java.util.Scanner;

public class Day28_ArrayList_GetInput_Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Multiple inputs from the user and store them in seperate
        // names, ages - store them

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();

        }

        for(Object o1: names)
        {
            System.out.println(o1);
        }

        for (Object o2: ages)
        {
            System.out.println(o2);
        }

        scanner.close();

    }
}
