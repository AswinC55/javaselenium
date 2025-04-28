package javaselenium.Day21_Inheritance_Types_and_Polymorphism.Hierarchical_Inheritance.Method_Overloading;

public class Day21_Exercise3_Calculator {

    public int add(int a , int b)
    {
        return a+b;
    }

    public double add(double a, double b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
        Day21_Exercise3_Calculator c1 = new Day21_Exercise3_Calculator();
        int r1=c1.add(3,6);
        double r2=c1.add(3.14, 6.36);
        System.out.println(r1);
        System.out.println(r2);

    }
}
