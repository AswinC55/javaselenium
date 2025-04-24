package javaselenium.Day18_OOPS_Concept;

public class Day18_Challenge1 {
    public static void main(String[] args) {
        person p1 = new person();
        p1.greet();
        System.out.println(p1.age());
        p1.a3(6,6);
        System.out.println(p1.a4("Pramod"));
        p1.age = 24;
        System.out.println(p1.age);



    }
}

class person{

    String name;
    double phone_number;
    int age;
    double weight;
    int height;
    String work;
    String Father_name;
    String Mother_name;
    double salary;
    int tax;

    static void greet()
    {
        System.out.println("Hi");
    }

    static int age()
    {
        return 10;
    }

    static void a3 ( int a1, int a2)
    {
        System.out.println(a1+a2);
    }

    static String a4 (String name)
    {
        return name;
    }



}