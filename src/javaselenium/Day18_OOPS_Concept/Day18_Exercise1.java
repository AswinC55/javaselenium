package javaselenium.Day18_OOPS_Concept;

public class Day18_Exercise1 {
    public static void main(String[] args) {

        Person amit;
        Person p1;
        Person p2 = new Person();

        /*Person -> Class
          p2 -> Object Reference
          new Person() -> Object
         */

        p2.name="Lucky";
        System.out.println(p2.name);

        Person p3= new Person();
        p3.name="Pramod";
        System.out.println(p3.name);

        new Person().name = "Not Refernce name";
        System.out.println(new Person().name);
    }
}


class Person{

    //Attribute | Properties | Data Members | Instance Variables

    String name;
    int phone_number;
    String colour_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    //Behaviour/ Method / Functions

    void sleep()
    {
        System.out.println("Sleeping");
    }

    String greet (String name)
    {
        return "Hello"+name;
    }

    void talk()
    {
        System.out.println("Talking");
    }

    int amount(int salary, int tax)
    {
        return salary-tax;
    }
}