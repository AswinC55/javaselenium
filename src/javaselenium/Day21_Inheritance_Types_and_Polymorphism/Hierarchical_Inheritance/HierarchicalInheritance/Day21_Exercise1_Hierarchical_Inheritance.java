package javaselenium.Day21_Inheritance_Types_and_Polymorphism.Hierarchical_Inheritance.HierarchicalInheritance;

public class Day21_Exercise1_Hierarchical_Inheritance {
    public static void main(String[] args) {

        Father f1 = new Father();
        f1.home();
        System.out.println("---");

        Son s2 = new Son();
        s2.home();
        s2.s1();
        System.out.println("---");

        Daughter d2 = new Daughter();
        d2.home();
        d2.d1();
        System.out.println("---");

        Son_2 s3 = new Son_2();
        s3.home();
        s3.s2();
        System.out.println("---");
    }
}

class Father{

    void home()
    {
        System.out.println("3 BHK");
    }

}

class Son extends  Father{

    void s1()
    {
        System.out.println("s1");
    }

}

class Daughter extends  Father{

    void d1()
    {
        System.out.println("d1");
    }
}

class Son_2 extends Father{

    void s2()
    {
        System.out.println("s2");
    }
}