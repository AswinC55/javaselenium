package javaselenium.Day23_Super_Keyword_Abstraction_Interface.Interface;

public class Day23_Interface_Exercise5 {
    public static void main(String[] args) {

    }
}

class ConcreteClass implements Incomplete_Interface{


    @Override
    public void display() {
        System.out.println("Hi");
    }
}



interface Incomplete_Interface{

    int a=10; //final
    void display();


    default void display2()
    {
        System.out.println("Default is allowed");
    }

    static void display3()
    {
        System.out.println("Static is allwoed");
    }

    //Incomplete_Interface() {}  Constructor not allowed
}


abstract class Incomplete_abstract{

    int a=10; //Not a final value-Instance variable
    abstract void display1();
    void display2()
    {

    }

    Incomplete_abstract() //Can have Constructor
    {

    }
}