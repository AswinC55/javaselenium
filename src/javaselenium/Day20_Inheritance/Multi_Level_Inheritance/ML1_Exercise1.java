package javaselenium.Day20_Inheritance.Multi_Level_Inheritance;

public class ML1_Exercise1 {
    public static void main(String[] args) {

        GrandFather g1 = new GrandFather();
        g1.gf();
        System.out.println("---");

        Father f1 = new Father();
        f1.gf();
        f1.f();
        System.out.println("---");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();
    }
}
