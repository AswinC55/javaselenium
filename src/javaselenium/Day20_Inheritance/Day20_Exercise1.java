package javaselenium.Day20_Inheritance;

public class Day20_Exercise1 {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk_2();

        Son s2 = new Son();
        s2.bhk_3();
        s2.bhk_2(); //Father 2BHK
        System.out.println(s2.gold); //Father gold son can extend

    }
}

class Father{

    int gold= 1000;  // Attribute | Data variables |  Property | Instance Variables

    void bhk_2()  //  Behaviour |  Method | Function | Data members
    {
        System.out.println("Father - 2BHK");
    }
}

class Son extends Father{

    void bhk_3()
    {
        System.out.println("Son - 3BHK");
    }
}