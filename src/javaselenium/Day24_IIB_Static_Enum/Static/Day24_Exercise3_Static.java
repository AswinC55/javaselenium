package javaselenium.Day24_IIB_Static_Enum.Static;

public class Day24_Exercise3_Static {
    public static void main(String[] args) {

        D ref1 = new D(10);
        ref1.display();
        System.out.println(D.b);
        ref1.b=30;
        System.out.println(ref1.b);
        D.b=40;
        System.out.println(ref1.b);
        System.out.println(D.b);

        System.out.println("---");

        D ref2 = new D(50);
        ref2.display();
        System.out.println(ref2.b);
        System.out.println(D.b);

        System.out.println("---");

        D ref3 = new D(60);
        ref3.display();
        System.out.println(ref3.b);
        System.out.println(D.b);
    }
}


class D {

    int a; // non static -> instance variable / properties/ attribute / fields
    static int b=20;

    D(int a)
    {
        this.a=a;
    }

    void display()
    {
        System.out.println(this.a);

    }

}