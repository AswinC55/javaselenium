package javaselenium.Day22_Encapsulation_Access_Modifiers;

public class Day22_Exercise3_AccessModifiers {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.summa();

    }
}


class Father{

    private int gold=100;
    protected int bhk3=10;
    int car =1;
}

class Son extends Father{

    void summa()
    {
       // System.out.println(gold);
        System.out.println(bhk3);
        System.out.println(car);
    }
}