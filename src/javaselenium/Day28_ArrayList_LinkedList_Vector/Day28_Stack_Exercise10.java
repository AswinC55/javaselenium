package javaselenium.Day28_ArrayList_LinkedList_Vector;

import java.util.Stack;

public class Day28_Stack_Exercise10 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Hi");
        s.push("Pramod");
        s.push("Aswin");
        s.push("Praveen");
        s.push("Siva");
        s.push("Siva2");

        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        System.out.println(s.add("Siva"));
        s.add("Siva");
        s.add("Siva");
        s.push("Siva");
        System.out.println(s);

    }
}
