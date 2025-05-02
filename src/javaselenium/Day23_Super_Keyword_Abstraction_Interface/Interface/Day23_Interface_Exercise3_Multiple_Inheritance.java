package javaselenium.Day23_Super_Keyword_Abstraction_Interface.Interface;

public class Day23_Interface_Exercise3_Multiple_Inheritance {
    public static void main(String[] args) {

        Son s1 = new Son();
        s1.money();
    }
}

interface Dad{

    void money();
}

interface Mom{
    void money();
}

class Son implements Dad, Mom{

    @Override
    public void money() {
        System.out.println("Child's Money");
    }
}