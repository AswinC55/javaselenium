package javaselenium.Day23_Super_Keyword_Abstraction_Interface.Interface;

public class Day23_Interface_Exercise1 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.getArea(3,4);

        Triangle t1 = new Triangle();
        t1.getArea(3,6);
    }
}

interface Shape{

    void getArea(int length, int breadth);
}

class Triangle implements Shape{


    @Override
    public void getArea(int base, int height) {

        System.out.println("Area of triangle is "+(0.5*base*height));
    }
}

class Rectangle implements Shape{


    @Override
    public void getArea(int length, int breadth)
    {
        System.out.println("Area of Rectangle is "+(length*breadth));

    }
}