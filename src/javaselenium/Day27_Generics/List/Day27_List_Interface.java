package javaselenium.Day27_Generics.List;

import java.util.ArrayList;
import java.util.List;

public class Day27_List_Interface {
    public static void main(String[] args) {

      //  List fruits = new List() ;
        List fruits = List.of("Orange", "Apple", "banana", "Mango", "Watermelon");
        System.out.println(fruits);
        //fruits.add("Chikku"); //java.lang.UnsupportedOperationException
        //fruits.remove("Apple"); //Not possible

        List l = new ArrayList(); //Dynamic Dispatch
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
