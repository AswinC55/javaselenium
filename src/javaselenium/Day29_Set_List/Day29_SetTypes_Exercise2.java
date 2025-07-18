package javaselenium.Day29_Set_List;

import java.util.*;

public class Day29_SetTypes_Exercise2 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        //Hashing Mechanism to store elements
        //No Order
        //No duplicates
        //Null allowed

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
       // hs.add(123);
        hs.add(null);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.contains("Orange"));
        System.out.println("---");

        for(String s:hs)
        {
            System.out.println(s);
        }

        System.out.println("---");

        Iterator iterator = hs.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("---");

        Set lhs = new LinkedHashSet();
        //Linked Mechanism to store the elements
        //Same order as in the code will be the output
        //No duplicates



        lhs.add("Dpple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());

        System.out.println("---");

        Set ts = new TreeSet();
        //Black and Red Tree mechanism to store the elements
        //Order will maintain, Natural sorting is done
        //Natural Sorting -Based on ASCII Values

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Appa");
        ts.add("Orange");
        ts.add("apple");
        ts.add("Apple");
        ts.add("Watermelon");
        ts.add("");
        //ts.add(12);  java.lang.ClassCastException
        //ts.add(null);  java.lang.NullPointerException
        System.out.println(ts);

        for (Object o: ts)
        {
            System.out.println(o);
        }


        Set ts1 = new TreeSet();

        ts1.add(18);
        ts1.add(15);
        ts1.add(12);
        ts1.add(5);
        ts1.add(345);
        ts1.add(24);
       // ts1.add("Something");

        System.out.println(ts1);


    }
}
