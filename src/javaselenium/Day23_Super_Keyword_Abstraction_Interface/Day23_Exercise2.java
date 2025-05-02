package javaselenium.Day23_Super_Keyword_Abstraction_Interface;

public class Day23_Exercise2 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.display();
    }
}

class God{

    God()
    {
        System.out.println("God Constructor");
    }

    void sound()
    {
        System.out.println("God Om sound");
    }
}

class Animal extends God{

    protected String colour = "White";

    Animal()
    {
        System.out.println("Animal");
    }

    void sound()
    {
        System.out.println("Animal sounds");
        super.sound();
    }
}

class Dog extends Animal{

    private String colour = "Red";

    Dog()
    {
        System.out.println("Dog");
    }

    void sound()
    {
        System.out.println("Dog Barks");
    }

    void display()
    {

        System.out.println(this.colour);
        System.out.println(super.colour);
        this.sound();
        super.sound();

    }
}
