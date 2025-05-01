package javaselenium.Day22_Encapsulation_Access_Modifiers.Challenge1;

public class Single_Inheritance {
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println(s1.money);
        System.out.println(s1.gold);
        System.out.println(s1.money_son);
        System.out.println(s1.gold_son);
        s1.asset();
        s1.asset1();
    }
}

class Father {
    int money=100;
    int gold=200;

    void asset()
    {
        System.out.println("Less assets");
    }
}

class Son extends Father{

    int money_son= 300;
    int gold_son =500;

    void asset1()
    {
        System.out.println("More assets");
    }
}