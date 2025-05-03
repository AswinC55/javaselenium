package javaselenium.Day24_IIB_Static_Enum.Static;

public class Day24_Exercise4_Static {
    public static void main(String[] args) {
        System.out.println(E.b);
        E.display1();

        System.out.println("---");
        E ref1 = new E();
        System.out.println(ref1.a);
        ref1.display();

    }
}


class E{

    static
    {
        System.out.println("SIB");
    }

    int a =10;
    static int b =20;

    void display()
    {
        System.out.println(b);
        System.out.println("Non static Function");
    }

    static void display1()
    {
       // System.out.println(a);    System.out.println(this.a);
        System.out.println("Static Function");
    }

//    static class F{    // Not useful
//
//    }
}