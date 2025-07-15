package javaselenium.Day27_Generics.List;

import java.util.ArrayList;

public class Day27_List_Interface2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta");
        arrayList.add(123);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
