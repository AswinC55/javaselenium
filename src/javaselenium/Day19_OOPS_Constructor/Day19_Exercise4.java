package javaselenium.Day19_OOPS_Constructor;

public class Day19_Exercise4 {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        Car2 c2 = new Car2();
        Car2 c3 = new Car2("Hyundai", "Exter", 2023);
        Car2 c4 = new Car2("Audi", "A6", 2025);

        System.out.println("---");
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println("---");

        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);
        System.out.println("---");

        System.out.println(c3.name);
        System.out.println(c3.model);
        System.out.println(c3.year);
        System.out.println("---");

        System.out.println(c4.name);
        System.out.println(c4.model);
        System.out.println(c4.year);
    }
}

class Car2{
    String name;
    String model;
    int year;

    Car2()
    {
        name ="Car";
        model ="XXX";
        year = 1990;
        System.out.println("Default constructor");
    }

    Car2(String name, String model, int year)
    {
        this.name = name;
        this.model = model;
        this.year = year;
        System.out.println("Parameterized Constructor");

    }
}
