package javaselenium.Day23_Super_Keyword_Abstraction_Interface;

public class Day23_Exercise1 {
    public static void main(String[] args) {

        Car c1 = new Car(10); //Will call Parameterized Constructor
        c1.display();
        System.out.println("---");
        c1.setSpeed(276);
        System.out.println(c1.getSpeed());

        System.out.println("---");
        Car c2 = new Car(); //Will call Default Constructor
    }
}

class Vehicle{

    int speed = 180;

    Vehicle()   //Default Constructor
    {
        System.out.println("Default Constructor");
    }

    Vehicle(int a) // Parameterized Constructor
    {
        System.out.println(a);
        System.out.println("Parameterized Constructor");
    }

    void message()
    {
        System.out.println("No return, No argument");
    }

    void message(int a)      // Method Overloading-Polymorphism
    {
        System.out.println("No return with argument");
    }

    void display()
    {
        System.out.println("Vehicle Parent");
    }


}

class Car extends Vehicle{

    private int speed=270;

    public int getSpeed() {   //Encapsulation
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    Car()   //Default Constructor
    {
        super();   // will call Default constructor of parent
        System.out.println("Hi");

    }

    Car(int a)   //Parameterized Constructor // Constructor Overloading
    {
        super(a); // will call Parameterized Constructor of parent
        System.out.println("Hello");
    }

    @Override
    void message() {
        System.out.println("Car message");
    }

    @Override
    void display()    //Method overriding-Polymorphism
    {

        System.out.println(this.speed);        //This concept
        System.out.println(super.speed);     //Super concept
        this.message();                    // This concept
        super.message();                  //Super concept
        super.message(10);            //Super concept
        super.display();                //Super concept

        System.out.println("Overridden");
    }

}