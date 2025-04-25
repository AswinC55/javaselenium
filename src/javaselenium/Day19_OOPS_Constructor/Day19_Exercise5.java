package javaselenium.Day19_OOPS_Constructor;

public class Day19_Exercise5 {
    public static void main(String[] args) {
        person p1 = new person("Lucky", 976543210, "XXX");
        person p2 = new person("Siva", 12345679, "ABC");
        person p3 = new person();
        person p4 = new person("Pramod", 13579);

        p3.name="Hi";

        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p1.address);

        System.out.println(p3.name);
        System.out.println(p3.phone);
        System.out.println(p4.name);
        System.out.println(p4.phone);
        System.out.println(p4.address);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}

class person{
    String name;
    long phone;
    String address;

    person()
    {

    }

    person(String  name_arg, long phone_arg)
    {
        this.name = name_arg;
        this.phone = phone_arg;
    }

    person(String name_arg, long phone_arg, String address_arg)
    {
        this.name=name_arg;
        this.phone=phone_arg;
        this.address=address_arg;
    }

    void eat()
    {
        System.out.println(this.name+ " is eating");
    }
}
