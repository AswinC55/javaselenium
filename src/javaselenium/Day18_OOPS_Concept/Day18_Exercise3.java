package javaselenium.Day18_OOPS_Concept;

public class Day18_Exercise3 {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        Cat c2;
        new Cat();

        c1.running();
        //c2.running();

        new Cat().running();
        System.out.println(new Cat().name);
    }
}

class Cat{

    String name;

    void running()
    {
        System.out.println("Running");
    }

}
