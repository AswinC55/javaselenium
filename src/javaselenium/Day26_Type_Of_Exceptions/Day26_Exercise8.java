package javaselenium.Day26_Type_Of_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Day26_Exercise8 {
    public static void main(String[] args) {


        System.out.println("Start");

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }
}
