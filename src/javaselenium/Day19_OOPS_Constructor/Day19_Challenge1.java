package javaselenium.Day19_OOPS_Constructor;

public class Day19_Challenge1 {
    public static void main(String[] args) {

        Person2 p1 = new Person2();
        Person2 p2 = new Person2("Lucky", 30);
        Person2 p3 = new Person2("Pramod", 36, "ABC", 12345679, true);

        p1.eat();
        p2.sleep();
        p3.walk();
        p3.doHome();
        System.out.println("----");
        p1.print_details();
        p2.print_details();
        p3.print_details();

    }
}

class Person2 {

    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    Person2()
    {
        name= "Default Constructor";
        age=39;
        address="XYZ";

    }

    Person2(String name_arg, int age_arg)
    {
        this.name=name_arg;
        this.age=age_arg;
    }

    Person2(String name_arg, int age_arg, String address_arg, long phone_arg, boolean isMale_arg)
    {
        this.name=name_arg;
        this.age=age_arg;
        this.address=address_arg;
        this.phone=phone_arg;
        this.isMale=isMale_arg;
    }

    void eat() {System.out.println(this.name+ " is eating");}

    void sleep()
    {
        System.out.println(this.name+ " is sleeping");
    }

    void walk()
    {
        System.out.println(this.name+ " is walking");
    }

    void doHome()
    {
        System.out.println(this.name+ " is in home");
    }

    void print_details()
    {
        System.out.println("Name-" +this.name);
        System.out.println("Age-" +this.age);
        System.out.println("Address-" +this.address);
        System.out.println("Phone-" +this.phone);
        System.out.println("Male-" +this.isMale);
        System.out.println("------");
    }
}
