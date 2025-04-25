package javaselenium.Day19_OOPS_Constructor;

public class Day19_Exercise3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.name ="Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("-----");

        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
    }
}

class Car{
    String name;
    int year;
    String model;

    Car()
    {
        name="Unknown Car";
        year=1990;
        model ="XXX";
    }

}