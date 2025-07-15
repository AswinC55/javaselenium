package javaselenium.Day28_ArrayList_LinkedList_Vector;

import java.util.LinkedList;

public class Day28_LinkedList_Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();

        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);

        System.out.println("First Element: " +animals.getFirst());
        System.out.println("Last Element: " +animals.getLast());

        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removing first and last elements: " + animals);

        System.out.println("Size of LinkedList: " +animals.size());


    }
}
