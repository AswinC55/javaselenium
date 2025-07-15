package javaselenium.Day28_ArrayList_LinkedList_Vector;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Day28_ArrayList_Exercise1 {

    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList(12);
        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("3"); //3
        list.add(4);   //4
        list.add(true); //5
        list.add("3");  //6

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.get(0)); //0
        System.out.println(list.get(2)); //2
        System.out.println(list.get(3)); //3
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));
        System.out.println(list.indexOf(4));
        System.out.println(list.lastIndexOf(4));
        System.out.println(list);

        System.out.println("----");

        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println(list);
    }
}
