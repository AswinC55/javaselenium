package javaselenium.Day22_Encapsulation_Access_Modifiers.Challenge2;

public class Method_Overloading {
    public static void main(String[] args) {

        something s1 = new something();
        System.out.println("Multiplication of 2 integers: " +s1.mul(4,5));
        int r2 = s1.mul(3,6,9);
        System.out.println("Multiplication of 3 integers: " +r2);
        double r3 = s1.mul(3.33, 6.36);
        System.out.println("Multiplication of 2 decimals: " +r3);
        System.out.println("Multiplication of 3 decimals: " +s1.mul(3.12, 6.12,9.27));

    }
}

class something{

    int mul(int a, int b)
    {
        return a*b;
    }

    int mul(int a, int b, int c)
    {
        return a*b*c;
    }

    double mul(double a, double b)
    {
        return a*b;
    }

    double mul(double a, double b, double c)
    {
        return a*b*c;
    }


}