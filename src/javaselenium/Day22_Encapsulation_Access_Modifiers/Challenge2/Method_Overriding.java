package javaselenium.Day22_Encapsulation_Access_Modifiers.Challenge2;

public class Method_Overriding {
    public static void main(String[] args) {
       /* A a1 = new A();
        a1.dad();
        B b1 = new B();
        b1.dad();
        C c1 = new C();
        c1.dad();
*/

        A a;

        a = new A();
        a.dad();
        a = new B();
        a.dad();
        a = new C();
        a.dad();
    }
}

class A {

    void dad()
    {
        System.out.println("Dad1");
    }
}

class B extends A {
    @Override
    void dad()
    {
        System.out.println("Dad2");
    }
}

class C extends B {
    @Override
    void dad()
    {
        System.out.println("Dad3");
    }
}
