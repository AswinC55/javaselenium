package javaselenium.Day27_Generics.List;

import java.util.ArrayList;
import java.util.List;

public class Day27_List_Interface3 {

    public static void main(String[] args) {
        List fruits = List.of("Orange", "Apple", "Banana", "Mango", "Watermelon");
        System.out.println(fruits);
        // fruits.add("Chikku");
        // fruits.add("Apple");
        List l = new ArrayList();
        ArrayList l2 = new ArrayList();
        l.add("Hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
        System.out.println(l);
        l2.add("Hi");
        l2.add(12);
        System.out.println(l2);
    }
}
