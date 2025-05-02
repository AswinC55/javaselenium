package javaselenium.Day23_Super_Keyword_Abstraction_Interface.Abstraction;

public class Day23_Abstract_Exercise1 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();
        s1.loan25K();
       // Father f1 = new Father();
        Father f2 = new Son();
        f2.loan50K();
        f2.loan25K();
    }
}

abstract class Father{

    abstract void loan50K();

    void loan25K()
    {
        System.out.println("25K Paid");
    }
}

class Son extends Father{

    @Override
    void loan50K() {
        System.out.println("son will pay 50K loan");
    }
}