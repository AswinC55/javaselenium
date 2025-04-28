package javaselenium.Day21_Inheritance_Types_and_Polymorphism.Hierarchical_Inheritance.Method_Overriding;

public class Day21_Overriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        Animal a1 = new Animal();
        a1.sound();
    }
}

class Animal{

    void sound()
    {
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal{

    @Override
    void sound()
    {
        System.out.println("Dog Barks");
    }
}
