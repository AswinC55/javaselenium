package javaselenium.Day29_Set_List;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Day29_Set_Exercise1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Siva");
        hs.add("Siva");
        hs.add("Siva");
        hs.add("Praveen");
        System.out.println(hs);
    }
}
