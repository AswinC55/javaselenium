package javaselenium.Day26_Type_Of_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Day26_Exercise9 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
        String s1 = null;
        s1.trim();
        int a = 10/0;
        File file = new File("");
    }

    static void t() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
