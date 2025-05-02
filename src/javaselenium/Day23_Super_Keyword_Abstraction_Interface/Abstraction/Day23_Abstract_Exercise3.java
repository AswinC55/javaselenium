package javaselenium.Day23_Super_Keyword_Abstraction_Interface.Abstraction;

public class Day23_Abstract_Exercise3 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        System.out.println(e1.computePay());
        e1.mailCheck();

        System.out.println("---");

        Employee1 e2 = new Employee1("Siva", "ABC", 123);
        e2.mailCheck();
        System.out.println(e2.computePay());



    }
}

abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee()
    {
        System.out.println("Default Constructor");
    }

    Employee(String name, String address, int number)
    {
        System.out.println("Constructing an employee");
        this.name=name;
        this.address=address;
        this.number=number;
    }

    abstract double computePay();

    void mailCheck()
    {
        System.out.println("Mailing check to " +this.name+ " " +this.address+ " " +this.number);
    }
}

class Employee1 extends Employee{

    Employee1(String name, String address, int number)
    {
        super(name,address,number);
        System.out.println("Hello");
    }

    double computePay()
    {
        System.out.println("Hi");
        return 0;
    }

    Employee1()
    {
        System.out.println("Employee1 DC");
    }
}
