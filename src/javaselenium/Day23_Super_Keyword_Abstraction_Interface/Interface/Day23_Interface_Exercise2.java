package javaselenium.Day23_Super_Keyword_Abstraction_Interface.Interface;

public class Day23_Interface_Exercise2 {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.drive();
        c1.test();

    }
}

class Car implements Engine, Brake{

    void drive()
    {
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");

    }

}


interface Brake{

    void applyBreak();
}

interface Engine{

    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("Concrete complete");
    }
}