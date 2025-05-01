package javaselenium.Day22_Encapsulation_Access_Modifiers.Challenge1;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {

        C c1 = new C();
        System.out.println(c1.name);
        System.out.println(c1.name2);
        c1.asset();
        c1.asset2();
        System.out.println("---");
        
        B b1 = new B();
        System.out.println(b1.name);
        System.out.println(b1.name1);
        b1.asset();
        b1.asset1();

    }
}

class A {
    
    String name="Praveen";
    
    void asset()
    {
        System.out.println("Praveen's asset");
    }
}

class B extends A{
    
    String name1="Siva";
    
    void asset1()
    {
        System.out.println("Siva's asset");
    }
}

class C extends A{
    
    String name2 ="Pramod";
    
    void asset2()
    {
        System.out.println("Pramod's asset");
    }
}
