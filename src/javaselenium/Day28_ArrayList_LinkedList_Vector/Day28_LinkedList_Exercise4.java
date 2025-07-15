package javaselenium.Day28_ArrayList_LinkedList_Vector;

import java.util.*;

public class Day28_LinkedList_Exercise4 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList();

        List mylist2 = new LinkedList(); //Doubly Linked List

        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Praveen");
        mylist2.add("Siva");
        mylist2.add("Siva");
        mylist2.add("Siva");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add("123");
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Dutta"));
        System.out.println(mylist2.indexOf("Dutta"));

    }
}
