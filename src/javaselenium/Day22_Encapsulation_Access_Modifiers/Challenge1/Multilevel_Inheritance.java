package javaselenium.Day22_Encapsulation_Access_Modifiers.Challenge1;

public class Multilevel_Inheritance {
    public static void main(String[] args) {

        Child c1 = new Child();
        System.out.println(c1.money);
        System.out.println(c1.money_dad);
        System.out.println(c1.money_child);
        c1.asset();
        c1.asset1();
        c1.asset2();
    }
}

class Grandfather{
    
    int money =100;
    
    void asset()
    {
        System.out.println("Grandfather's Asset");
    }
}

class Dad extends Grandfather{

    int money_dad=200;

    void asset1()
    {
        System.out.println("Dad's asset");
    }

}


class Child extends Dad{

    int money_child=300;

    void asset2()
    {
        System.out.println("Child's asset");
    }

}