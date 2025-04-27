package javaselenium.Day20_Inheritance.Multi_Level_Inheritance;

import javax.xml.transform.Source;

public class ML_Exercise2 {
    public static void main(String[] args) {

        //Son s1 = new GrandFather();
        //Son s2 = new Father();
        Son s3 = new Son();
        s3.home();
        s3.s();
        s3.f();
        s3.gf();
        System.out.println("---");

      //Father f1 = new GrandFather();
        Father f2 = new Father();
        f2.home();
        Father f3 = new Son();
        f3.home();
        System.out.println(f2.gold_gf);
        System.out.println(f2.gold_f);
        System.out.println("---");

        GrandFather g1 = new GrandFather();
        g1.home();
        GrandFather g2 = new Father();
        g2.home();
        System.out.println(g2.gold_gf);
        GrandFather g3 = new Son();
        g3.gf();
        g3.home();
        System.out.println(g3.gold_gf);

    }
}
