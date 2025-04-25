package javaselenium.Day19_OOPS_Constructor;

public class Day19_Exercise1 {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        Baby b2;

    }
}

class Baby{

    void sleep()
    {
        System.out.println("Sleep");
    }

    void cry()
    {
        System.out.println("Cry");
    }

    void eat()
    {
        System.out.println("Eat");
    }

    Baby()
    {
        System.out.println("This is Constructor Class");
    }
}
