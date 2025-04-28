package javaselenium.Day21_Inheritance_Types_and_Polymorphism.Hierarchical_Inheritance.Method_Overloading;

public class Day21_Exercise2_Met_Overloading {
    public static void main(String[] args) {

        MathOperations m1 = new MathOperations();
        double r1 = m1.add(3.14,6.3);
        int r2 = m1.add(3,6);
        int r3 = m1.add(3,6,9);
        String r4 = m1.add("Pramod ","Dutta");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}

class MathOperations{

    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    double add(double a, double b)
    {
        return a+b;
    }

    String add(String a, String b)
    {
        return a+b;
    }

}
