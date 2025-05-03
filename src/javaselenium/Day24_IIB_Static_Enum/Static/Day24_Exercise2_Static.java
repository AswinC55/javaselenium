package javaselenium.Day24_IIB_Static_Enum.Static;

public class Day24_Exercise2_Static {
    public static void main(String[] args) {

        P p1 = new P();
        P p2 = new P();
        P p3 = new P();

        C c1 = new C();

        //new P();
    }
}

class P{

    {
        System.out.println("IIB");
    }

    P()
    {
        System.out.println("DC");
    }

    static
    {
        System.out.println("SIB");
    }

}


class C{

    static
    {
        System.out.println("SIB 2");
    }

}