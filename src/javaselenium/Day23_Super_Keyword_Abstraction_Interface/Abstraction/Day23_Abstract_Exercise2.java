package javaselenium.Day23_Super_Keyword_Abstraction_Interface.Abstraction;

public class Day23_Abstract_Exercise2 {
    public static void main(String[] args) {

        Audi a1 = new Audi();
        a1.drive();
    }
}

abstract class Engine{

    abstract void startEngine();
    abstract void stopEngine();
}

class Audi extends Engine{


    @Override
    void startEngine()
    {
        System.out.println("Starting the Engine");
    }

    @Override
    void stopEngine()
    {
        System.out.println("Stopping the Engine");
    }

    void drive()
    {
        startEngine();
        stopEngine();
    }
}